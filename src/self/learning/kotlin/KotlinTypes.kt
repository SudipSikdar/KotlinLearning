package self.learning.kotlin

import java.lang.Exception

lateinit var title: String

var count = 10
get() = field*2
set(value: Int) {

    if(value < 0) {
        throw Exception()

    }
    field = value
}

var x = "Sudip"
fun main() {

    println(count)
    println(title)
}