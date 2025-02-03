package com.example.internal.api.env

import com.example.client.transfer.env.EnvFromPropertySource
import com.example.internal.api.support.ProductionPhase
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

@ProductionPhase
class EnvProductionPhaseTest {
    @Autowired
    private lateinit var envFromPropertySource: EnvFromPropertySource

    @Nested
    inner class EnvFromPropertySourceTest {
        @Test
        @DisplayName("Properties are set correctly")
        fun propertiesAreSetCorrectly() {
            Assertions.assertEquals(
                mapOf(
                    "host" to "https://production-partner.kakaopay.com",
                    "transfer-money-path" to "/v1/transfer/money/by-property-source"
                ),
                envFromPropertySource.properties
            )
        }
    }
}