package com.opentext.openid.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @GetMapping("/rest/product")
    public String index() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return "Here is a list of products for " + username;
    }

}
