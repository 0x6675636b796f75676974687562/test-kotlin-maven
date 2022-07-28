package com.example

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CIntegrationTest {
    @Test
    fun t() {
        assertEquals(42, C.g())
    }
}
