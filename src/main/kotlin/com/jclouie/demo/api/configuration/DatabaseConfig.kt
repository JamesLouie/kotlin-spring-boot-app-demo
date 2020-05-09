package com.jclouie.demo.api.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("database")
data class DatabaseConfig (
        var username: String,
        var password: String
)
