package com.jclouie.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
