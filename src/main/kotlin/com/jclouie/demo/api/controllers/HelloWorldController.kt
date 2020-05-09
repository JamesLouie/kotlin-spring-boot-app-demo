package com.jclouie.demo.api.controllers

import com.jclouie.demo.api.configuration.DatabaseConfig
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(val databaseConfig: DatabaseConfig) {

    @GetMapping("/")
    fun hi(): String {
        return "Hello World ${databaseConfig.username}"
    }
}