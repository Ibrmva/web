package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MainController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required = false,
            defaultValue = "Gulaiym") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}

