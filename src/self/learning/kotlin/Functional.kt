package self.learning.kotlin

fun main() {
    val list = listOf("Java", "JavaScript", "C++", "Kotlin",null,null)

    val map = list
            .filterNotNull()
            .associate { it to it.length }

    val language = list.filterNotNull().find{ it.startsWith("java") }
    println(language)

}