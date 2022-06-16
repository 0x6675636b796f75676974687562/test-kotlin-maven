package com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.annotation.Repeat
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.support.AnnotationConfigContextLoader

/**
 * _Spring_ version **below** 4.3 should be used.
 */
@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(loader = AnnotationConfigContextLoader::class)
class MultipleViaSpring {
	private var testRunNumber = 0

	@Repeat(10)
	@Test
	fun multiple() {
		System.out.printf("MultipleViaSpring.multiple(%d)%n", testRunNumber++)
	}
}
