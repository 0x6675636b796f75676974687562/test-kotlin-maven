package com.example

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class RepeatRule : TestRule {
	private class RepeatStatement(private val statement: Statement,
				      private val repeat: Int) : Statement() {
		override fun evaluate() {
			for (i in 0 until repeat) {
				statement.evaluate()
			}
		}
	}

	override fun apply(statement: Statement, description: Description): Statement =
		description.getAnnotation(Repeat::class.java)?.let { repeat ->
			RepeatStatement(statement, repeat.times)
		} ?: statement
}
