package com.jclouie.demo.application.handlers

import com.jclouie.demo.application.dto.CreateProductCommand
import com.jclouie.demo.domain.models.Product
import com.jclouie.demo.persistence.mongodb.IProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductHandler(val productRepository: IProductRepository) {

    fun insert(command: CreateProductCommand): Product {
        val product = Product(null, command.productName, command.productDescription)
        return productRepository.insert(product)
    }

    fun findById(id: String): Optional<Product> = productRepository.findById(id)
}