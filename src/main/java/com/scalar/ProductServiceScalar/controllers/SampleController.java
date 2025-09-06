package com.scalar.ProductServiceScalar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // REST + Controller => Http API's + Controller
@RequestMapping("/search")
public class SampleController {
    // http://localhost:8080/random/hello
    @GetMapping("/hello/{numberOfTimes}")
    public String sayHello(@PathVariable("numberOfTimes") int numberOfTimes) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfTimes; i++) {
            sb.append("Hello Class!!");
        }

        return sb.toString();
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Bye Everyone!!";
    }
}
