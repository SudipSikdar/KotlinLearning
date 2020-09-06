package self.learning.kotlin

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?){
    list.forEach {
        if(predicate?.invoke(it)==true){
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("j")
}

fun getPrintPredicate(): (String) -> Boolean{
    return {it.startsWith("j")}
}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x,y)
}

fun sum(x: Int, y: Int) = x + y

fun main(){
    val list = listOf("java","Kotlin","javascript")
    printFilteredStrings(list, getPrintPredicate())

    printFilteredStrings(list,null)

    val sumResult = calculate(3,4, ::sum)
    val mulResult = calculate(3,4){x,y -> x*y}
    println("sumResult $sumResult, mulResult $mulResult")

    
}