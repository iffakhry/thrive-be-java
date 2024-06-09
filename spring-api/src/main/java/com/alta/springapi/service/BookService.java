package com.alta.springapi.service;

import com.alta.springapi.entity.Book;
import com.alta.springapi.entity.User;
import com.alta.springapi.model.BookRequest;
import com.alta.springapi.model.BookResponse;
import com.alta.springapi.model.BookSearchRequest;
import com.alta.springapi.model.BookUpdateRequest;
import com.alta.springapi.repository.BookRepository;
import com.alta.springapi.repository.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ValidationService validationService;

//    @PersistenceContext
//    private EntityManager entityManager;

    @Transactional
    public BookResponse create(BookRequest request){

        validationService.validate(request);

//        User user = entityManager.find(User.class, request.getUserId());
//
//        if (user == null){
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "user not found");
//        }

        // check user nya ada atau tidak
        User user = userRepository.findById(request.getUserId())
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"user not found"));

        Book book = new Book();
        book.setId(UUID.randomUUID().toString());
        book.setTitle(request.getTitle());
        book.setPublisher(request.getPublisher());
        book.setUser(user);

        bookRepository.save(book);

        return BookResponse.builder()
                .id(book.getId())
                .title(book.getTitle())
                .publisher(book.getPublisher())
                .userId(request.getUserId())
                .build();
    }

    private BookResponse toBookResponse(Book book){
        return BookResponse.builder()
                .id(book.getId())
                .title(book.getTitle())
                .publisher(book.getPublisher())
                .userId(book.getUser().getId())
                .build();
    }

    @Transactional(readOnly = true)
    public Page<BookResponse> search(BookSearchRequest request){
        Specification<Book> specification = (root, query, builder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (Objects.nonNull(request.getTitle())){
                predicates.add(
                        builder.like(root.get("title"), "%"+request.getTitle()+"%")
                );
            }

            if (Objects.nonNull(request.getPublisher())){
                predicates.add(
                        builder.like(root.get("publisher"), "%"+request.getPublisher()+"%")
                );
            }

            return query.where(predicates.toArray(new Predicate[]{})).getRestriction();
        };

        Pageable pageable = PageRequest.of(request.getPage(), request.getLimit());
        Page<Book> books= bookRepository.findAll(specification, pageable);
        List<BookResponse> bookResponses = books.getContent().stream()
                .map(this::toBookResponse)
                .toList();

        return new PageImpl<>(bookResponses, pageable, books.getTotalElements());

    }

    @Transactional(readOnly = true)
    public BookResponse getById(String id){
        Book book = bookRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "book not found"));

        return toBookResponse(book);
    }

    @Transactional
    public BookResponse update(BookUpdateRequest request){
        // pastikan book nya ada
        Book book = bookRepository.findById(request.getId())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "book not found"));

        book.setTitle(request.getTitle());
        book.setPublisher(request.getPublisher());
        bookRepository.save(book);

        return toBookResponse(book);
    }

    @Transactional
    public void delete(String bookId){
        // pastikan book nya ada
        Book book = bookRepository.findById(bookId)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "book not found"));

        bookRepository.delete(book);
    }
}
