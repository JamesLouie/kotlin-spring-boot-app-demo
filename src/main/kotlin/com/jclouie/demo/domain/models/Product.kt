package com.jclouie.demo.domain.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Product (
        @Id val productId: String?,
        val productName: String,
        val productDescription: String
)