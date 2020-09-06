package self.learning.kotlin

class Person(val firstName: String = "Sudip", val lastName: String = "Sikdar") {

    var nickName: String?=null


    fun printInfo() {
        val nickNameToPrint= nickName ?: "no nickName"
        println("$firstName, ($nickName), $lastName")
    }
}