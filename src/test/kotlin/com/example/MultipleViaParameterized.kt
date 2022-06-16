package com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(Parameterized::class)
class MultipleViaParameterized {
	@Test
	fun multiple() = Unit

	companion object {
		@Parameters
		@JvmStatic
		fun data(): List<Array<Any>> =
			Array(10) { emptyArray<Any>() }.toList()
	}
}
