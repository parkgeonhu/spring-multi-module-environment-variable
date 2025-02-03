package com.example.client.transfer.env

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "property-source")
class EnvFromPropertySource {
    lateinit var properties: Map<String, String>
}