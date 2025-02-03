package com.example.client.transfer

import com.example.client.transfer.env.EnvFromPropertySource
import com.example.client.transfer.env.EnvFromSpringConfigImport
import com.example.client.transfer.env.EnvFromSpringProfilesInclude
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class TransferClient(
    private val envFromSpringConfigImport: EnvFromSpringConfigImport,
    private val envFromSpringProfilesInclude: EnvFromSpringProfilesInclude,
    private val envFromPropertySource: EnvFromPropertySource
) {
    @PostConstruct
    fun postConstruct() {
        println("TransferClient initialized")
        println("envFromSpringConfigImport: ${envFromSpringConfigImport.properties}")
        println("envFromSpringProfilesInclude: ${envFromSpringProfilesInclude.properties}")
        println("envFromPropertySource: ${envFromPropertySource.properties}")
    }
}