package com.SpringBoot_MVC_Annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Simple calculator using RestController, RequestMapping and PathParam


@RestController
@RequestMapping("/calc")
public class CalculatorController {

    // Addition
    @GetMapping("/add/{a}/{b}")
    public double add(@PathVariable double a, @PathVariable double b) {
        return a + b;
    }

    // Subtraction
    @GetMapping("/sub/{a}/{b}")
    public double subtract(@PathVariable double a, @PathVariable double b) {
        return a - b;
    }

    // Multiplication
    @GetMapping("/mul/{a}/{b}")
    public double multiply(@PathVariable double a, @PathVariable double b) {
        return a * b;
    }

    //  Division
    @GetMapping("/div/{a}/{b}")
    public String divide(@PathVariable double a, @PathVariable double b) {

        if (b == 0) {
            return "Cannot divide by zero";
        }
        return "Result: " + (a / b);
    }
}
