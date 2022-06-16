package com.example

import org.junit.After
import org.junit.Assume
import org.junit.Assume.assumeTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Assumption violation in a method annotated with [After].
 */
@RunWith(JUnit4::class)
class IgnoredViaAfterMethod {
	@After
	fun tearDown() {
		println("About to violate an assumption...")
		assumeTrue("Test ignored", false)
	}

	@Test
	fun ignored0() = Unit

	@Test
	fun ignored1() = Unit
}
