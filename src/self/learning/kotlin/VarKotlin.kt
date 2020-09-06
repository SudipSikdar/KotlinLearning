package self.learning.kotlin

import java.time.temporal.ValueRange

const val name: String = "Nate"

fun getGreeting() = "Hello Kotlin"


fun sayHello(): Unit {
    println(getGreeting())
}

fun sayHello(greeting: String, vararg itemToGreet:String ) {
    itemToGreet.forEach {
        println(it)
    }
}

fun sayHello(greeting: String, value: String) = println("$greeting $value")

fun greetPerson(greeting: String ="hello", name: String) = println("$greeting, $name")

fun main(args: Array<String>) {

    val person = Person()
    person.printInfo()
    /*person.lastName
    person.firstName
    person.nickName= "Saaa"
    person.nickName = "New Nickname"
    println(person.nickName)

    greetPerson("hi","Sudip")
    greetPerson(name = "Sudip")

    println(name)
    println(getGreeting())
    sayHello("hey", "sudip")
    sayHello("hey", "Kotlin","Programming", "have fun")

    val interestedThings = arrayOf("Sudip", "Kotlin", "JVM language")
    val newList = listOf<String>("Sudip", "Sachin", "Sujit")

    val map = mutableMapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")

    println(interestedThings[0])
    println(interestedThings.size)

    for (interestThing in interestedThings) {
        println(interestThing)
    }

    interestedThings.forEachIndexed{ index, interestedThing ->
        println("$interestedThing is in index $index")

    }

    newList.forEach { value -> println(value) }
    map.forEach{ (key, value) -> println("$key -> $value")}*/


}


