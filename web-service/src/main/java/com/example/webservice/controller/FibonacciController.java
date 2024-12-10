package com.example.webservice.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FibonacciController {
    @GetMapping("/")
    public String number() {
        return "number";
    }

    @PostMapping("/generate")
    public String generator(@RequestParam int n, Model model) {
        List<Integer> fibonacciNumbers = FibonacciGenerator.generateFibonacci(n);
        model.addAttribute("fibonacciNumbers", fibonacciNumbers);
        model.addAttribute("n", n);
        model.addAttribute("error", null);
        return "result";
    }
}