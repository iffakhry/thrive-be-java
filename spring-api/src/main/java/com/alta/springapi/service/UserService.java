package com.alta.springapi.service;

import com.alta.springapi.entity.User;
import com.alta.springapi.model.UserRequest;
import com.alta.springapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ValidationService validationService;

    public void Create(UserRequest request){

        validationService.validate(request);

        // validation
        if (request.getEmail().equals("admin@admin.com")){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "email tidak bisa dipakai");
        }

        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setName(request.getName());
        userRepository.save(user);
    }
}
