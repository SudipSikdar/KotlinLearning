package self.learning.kotlin

import java.lang.reflect.Array

fun main() {
    print("Hello World");
}

fun printMessage(message: String): Unit {
    println(message);

}


fun printMessageWithPrefix(message: String, prefix: String ="Info") {
    println("[$prefix] $message");
}