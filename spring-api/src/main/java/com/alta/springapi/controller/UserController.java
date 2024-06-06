package com.alta.springapi.controller;

import com.alta.springapi.model.UserRequest;
import com.alta.springapi.model.WebResponse;
import com.alta.springapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //inject
    @Autowired
    private UserService userService;

    @PostMapping(
            path = "/users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> add(@RequestBody UserRequest request){
        userService.Create(request);
        return WebResponse.<String>builder()
                .message("success add data")
                .build();
    }
}
