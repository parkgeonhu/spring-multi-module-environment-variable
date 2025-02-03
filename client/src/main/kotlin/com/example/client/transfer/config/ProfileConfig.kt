package com.example.client.transfer.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.context.annotation.PropertySource

class ProfileConfig {
    @Configuration
    @Profile("sandbox")
    @PropertySource("classpath:/transfer-client/property-source-sandbox.properties")
    class SandboxConfig

    @Configuration
    @Profile("production")
    @PropertySource("classpath:/transfer-client/property-source-production.properties")
    class ProductionConfig

    @Configuration
    @Profile("!sandbox && !production")
    @PropertySource("classpath:/transfer-client/property-source-default.properties")
    class DefaultConfig
}