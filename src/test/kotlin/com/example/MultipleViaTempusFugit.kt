package com.example

import com.google.code.tempusfugit.concurrency.IntermittentTestRunner
import com.google.code.tempusfugit.concurrency.annotations.Intermittent
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(IntermittentTestRunner::class)
class MultipleViaTempusFugit {
	@Test
	@Intermittent(repetition = 10)
	fun multiple() = Unit
}
