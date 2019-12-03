package com.wylezek.oauth2basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @GetMapping("/v1/api/hello")
    public String get() {
        return "Hello";
    }
}
