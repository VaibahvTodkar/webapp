package com.bmt.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") // Optional but improves consistency
public class HomeController {

    @GetMapping
    public String home() {
        return "index"; // Ensure you have `index.html` in `src/main/resources/templates/`
    }
}
