package com.example.demo.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/v1/hello")
    fun hello(): String {
        return "Greetings from Spring Boot!"
    }

}