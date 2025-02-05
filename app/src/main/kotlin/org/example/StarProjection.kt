package org.example

import java.util.Random
val list : MutableList<Any?> = mutableListOf('a', 1, "qwe")
val chars = mutableListOf('a','b','c')
val unknownElements: MutableList<*> =
		if(Random().nextBoolean()) list else chars
