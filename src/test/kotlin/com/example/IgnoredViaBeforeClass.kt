package com.example

import org.junit.Assert.assertTrue
import org.junit.Assume.assumeTrue
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Assumption violation in a method annotated with [@BeforeClass][BeforeClass]
 * (should this happen within a test method, the corresponding test would have
 * been ignored). Standard tests annotated with [@Test][Test] are never
 * executed; the 1st `static` method annotated with [@BeforeClass][BeforeClass]
 * is reported as the only ignored test.
 */
@RunWith(JUnit4::class)
class IgnoredViaBeforeClass {
	@Test
	fun neverRunsNorIsReported0() =
		assertTrue("This test failure is never reached", false)

	@Test
	fun neverRunsNorIsReported1() =
		assertTrue("This test failure is never reached", false)

	companion object {
		@BeforeClass
		@JvmStatic
		fun setUpOnce() {
			println("About to violate an assumption...")
			assumeTrue("Regular test methods won't run, nor will appear as ignored", false)
		}
	}
}
