package com.example

import org.junit.AfterClass
import org.junit.Assume.assumeTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Assumption violation in a method annotated with [@AfterClass][AfterClass].
 * All standard tests annotated with [@Test][Test] are successful, and an extra
 * ignored test is reported.
 */
@RunWith(JUnit4::class)
class IgnoredViaAfterClass {
	@Test
	fun willSucceed0() = Unit

	@Test
	fun willSucceed1() = Unit

	companion object {
		@AfterClass
		@JvmStatic
		fun tearDownOnce() {
			println("About to violate an assumption...")
			assumeTrue("Extra ignored test", false)
		}
	}
}
