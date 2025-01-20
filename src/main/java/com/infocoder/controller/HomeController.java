package com.infocoder.controller;

import com.infocoder.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse homePageResponse() {
        return new ApiResponse("Welcome to ecommerce multi vendor system");
    }

}
