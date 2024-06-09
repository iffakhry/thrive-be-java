package com.alta.springapi.controller;

import com.alta.springapi.model.*;
import com.alta.springapi.service.BookService;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private static final Logger log = LoggerFactory.getLogger(BookController.class);
    @Autowired
    private BookService bookService;



    @PostMapping(
            path = "/books",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<BookResponse> create(@RequestBody BookRequest request){
        BookResponse bookResponse = bookService.create(request);
        return WebResponse.<BookResponse>builder()
                .message("success input data")
                .data(bookResponse)
                .build();
    }

    /**
     * Get all books
     * @param title
     * @param publisher
     * @param page : start from 0
     * @param limit
     * @return
     */
    @GetMapping(
            path = "/books",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<List<BookResponse>> search(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "publisher", required = false) String publisher,
            @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
            @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit
    ){
        BookSearchRequest request = BookSearchRequest.builder()
                .page(page)
                .limit(limit)
                .title(title)
                .publisher(publisher)
                .build();

        log.info("page: "+page.toString());
        log.info("title: "+title);
        Page<BookResponse> bookResponses = bookService.search(request);
        return WebResponse.<List<BookResponse>>builder()
                .data(bookResponses.getContent())
                .message("success")
                .pagination(PaginationResponse.builder()
                        .currentPage(bookResponses.getNumber())
                        .totalPage(bookResponses.getTotalPages())
                        .limit(bookResponses.getSize())
                        .build())
                .build();
    }

    @GetMapping(
            path = "/books/{bookId}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<BookResponse> getById(@PathVariable("bookId") String bookId){
        BookResponse bookResponse = bookService.getById(bookId);
        return WebResponse.<BookResponse>builder()
                .message("success get book")
                .data(bookResponse)
                .build();
    }

    @PutMapping(
            path = "/books/{bookId}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<BookResponse> update(
            @RequestBody BookUpdateRequest request,
            @PathVariable("bookId") String bookId
    ){
        request.setId(bookId);
        BookResponse bookResponse = bookService.update(request);
        return WebResponse.<BookResponse>builder()
                .message("success update data")
                .data(bookResponse)
                .build();
    }

    @DeleteMapping(
            path = "/books/{bookId}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> delete(@PathVariable("bookId") String bookId){
        bookService.delete(bookId);
        return WebResponse.<String>builder()
                .message("success delete book")
                .build();
    }

}