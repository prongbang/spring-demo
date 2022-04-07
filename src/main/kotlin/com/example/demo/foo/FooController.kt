package com.example.demo.foo

import com.example.demo.foo.domain.Bar
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class FooController {

    @ResponseBody
    @GetMapping("/v1/foo")
    fun foo(): ResponseEntity<Bar> {
        return ResponseEntity(Bar("Hi"), HttpStatus.OK)
    }

}