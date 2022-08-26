package com.example

/**
 * This is a simple class covered by both unit and integration tests.
 */
object C {
	/**
	 * @return 42
	 */
	fun f(): Int {
		return 42
	}

	/**
	 * @return 42
	 */
	val g: Int
		get() =
			42
}
