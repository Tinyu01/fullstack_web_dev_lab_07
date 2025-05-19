package com.quickcart.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for handling requests to the home page.
 */
@Controller
public class HomeController {

    /**
     * Redirect root URL to products page
     * URL: /
     */
    @GetMapping("/")
    public String home() {
        return "redirect:/products";
    }
}