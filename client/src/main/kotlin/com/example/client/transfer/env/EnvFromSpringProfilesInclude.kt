package com.example.client.transfer.env

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "spring-profiles-include")
class EnvFromSpringProfilesInclude {
    lateinit var properties: Map<String, String>
}