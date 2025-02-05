package org.lambda

fun lookForAlice(people: List<Person>) {
		people.forEach label@{
				if (it.name == "Alice") return@label
				}
		println("Alice might be somewhere")
}
