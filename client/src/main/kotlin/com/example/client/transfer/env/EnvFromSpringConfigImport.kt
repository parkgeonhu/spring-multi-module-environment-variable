package com.example.client.transfer.env

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "spring-config-import")
class EnvFromSpringConfigImport {
    lateinit var properties: Map<String, String>
}