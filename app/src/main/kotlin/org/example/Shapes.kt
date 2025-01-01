package org.shapes
import java.util.Random

class Rectangle(val height: Int, val width: Int) {
		val isSquare: Boolean
				get() = width == height
}
fun createRandomRectangle(): Rectangle {
		val random = Random()
		return Rectangle(random.nextInt(), random.nextInt())
}
