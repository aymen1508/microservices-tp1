package com.user_microservice.user_microservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingPageController {

    @GetMapping("/")
    public String landingPage() {
        return "This is the Users Microservice landing page";
    }
}
