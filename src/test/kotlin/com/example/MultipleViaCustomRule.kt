package com.example

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MultipleViaCustomRule {
	private var i = 0

	@get:Rule
	val repeatRule = RepeatRule()

	@Test
	@Repeat(times = 10)
	fun multiple() {
		System.out.printf("${javaClass.simpleName}.multiple(%d)%n", i++)
	}
}
