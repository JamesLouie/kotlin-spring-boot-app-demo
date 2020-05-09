package com.jclouie.demo.persistence.mongodb

import com.jclouie.demo.domain.models.Product
import org.springframework.data.mongodb.repository.MongoRepository

interface IProductRepository: MongoRepository<Product, String>
