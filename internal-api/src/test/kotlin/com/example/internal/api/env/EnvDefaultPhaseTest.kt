package com.example.internal.api.env

import com.example.client.transfer.env.EnvFromPropertySource
import com.example.client.transfer.env.EnvFromSpringConfigImport
import com.example.client.transfer.env.EnvFromSpringProfilesInclude
import com.example.internal.api.support.DefaultPhase
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

@DefaultPhase
class EnvDefaultPhaseTest {
    @Autowired
    private lateinit var envFromSpringConfigImport: EnvFromSpringConfigImport

    @Autowired
    private lateinit var envFromSpringProfilesInclude: EnvFromSpringProfilesInclude

    @Autowired
    private lateinit var envFromPropertySource: EnvFromPropertySource

    @Nested
    inner class EnvFromSpringConfigImportTest {
        @Test
        @DisplayName("Properties are set correctly")
        fun propertiesAreSetCorrectly() {
            Assertions.assertEquals(
                mapOf(
                    "host" to "https://partner.kakaopay.com",
                    "transfer-money-path" to "/v1/transfer/money/by-spring-config-import"
                ),
                envFromSpringConfigImport.properties
            )
        }
    }

    @Nested
    inner class EnvFromSpringProfilesIncludeTest {
        @Test
        @DisplayName("Properties are set correctly")
        fun propertiesAreSetCorrectly() {
            Assertions.assertEquals(
                mapOf(
                    "host" to "https://partner.kakaopay.com",
                    "transfer-money-path" to "/v1/transfer/money/by-spring-profiles-include"
                ),
                envFromSpringProfilesInclude.properties
            )
        }
    }

    @Nested
    inner class EnvFromPropertySourceTest {
        @Test
        @DisplayName("Properties are set correctly")
        fun propertiesAreSetCorrectly() {
            Assertions.assertEquals(
                mapOf(
                    "host" to "https://default-partner.kakaopay.com",
                    "transfer-money-path" to "/v1/transfer/money/by-property-source"
                ),
                envFromPropertySource.properties
            )
        }
    }
}