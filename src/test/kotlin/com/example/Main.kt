package com.example

import org.junit.Assert.assertTrue
import org.junit.Assume.assumeTrue
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class Main {
	@Test
	fun ignoredOnWindows() =
		assumeTrue("Always ignored on Windows", !System.getProperty("os.name").startsWith("Windows"))

	@Test
	fun ignoredExceptOnWindows() =
		assumeTrue("Never ignored on Windows", System.getProperty("os.name").startsWith("Windows"))

	@Test
	fun ignoredOnLinux() =
		assumeTrue("Always ignored on Linux", !System.getProperty("os.name").startsWith("Linux"))

	@Test
	fun ignoredExceptOnLinux() =
		assumeTrue("Never ignored on Linux", System.getProperty("os.name").startsWith("Linux"))

	@Test
	fun willSucceed() =
		assertTrue(true)

	@Test
	fun ignored() =
		assumeTrue(false)

	@Test
	@Ignore
	fun ignoredViaAnnotation() = Unit

	@Test
	@Ignore("This is an ignored test with a custom message")
	fun ignoredViaAnnotationWithMessage() = Unit
}
