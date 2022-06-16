package com.example

import org.junit.Assume
import org.junit.Assume.assumeTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Assumption violation in a method annotated with [Before].
 */
@RunWith(JUnit4::class)
class IgnoredViaBeforeMethod {
	@Before
	fun setUp() {
		println("About to violate an assumption...")
		assumeTrue("Test ignored", false)
	}

	@Test
	fun ignored0() = Unit

	@Test
	fun ignored1() = Unit
}
