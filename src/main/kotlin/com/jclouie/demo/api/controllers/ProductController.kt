package com.jclouie.demo.api.controllers

import com.jclouie.demo.application.dto.CreateProductCommand
import com.jclouie.demo.application.handlers.ProductHandler
import com.jclouie.demo.domain.models.Product
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController("")
@RequestMapping("product")
class ProductController(val productHandler: ProductHandler) {

    @PostMapping("/")
    fun insert(@RequestBody command: CreateProductCommand): Product {
        return productHandler.insert(command);
    }

    @GetMapping("/{productId}")
    fun findProductById(@PathVariable("productId") productId: String): Optional<Product> {
        return productHandler.findById(productId);
    }
}