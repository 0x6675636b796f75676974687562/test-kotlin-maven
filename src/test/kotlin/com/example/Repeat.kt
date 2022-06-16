package com.example

import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS
import kotlin.annotation.AnnotationTarget.FUNCTION
import kotlin.annotation.AnnotationTarget.PROPERTY_GETTER
import kotlin.annotation.AnnotationTarget.PROPERTY_SETTER

@Retention(RUNTIME)
@Target(FUNCTION,
	PROPERTY_GETTER,
	PROPERTY_SETTER,
	ANNOTATION_CLASS)
annotation class Repeat(val times: Int = 1)
