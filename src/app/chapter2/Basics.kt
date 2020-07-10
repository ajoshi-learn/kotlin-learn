package app.chapter2

fun main(args: Array<String>) {
    val immutable = 23
    var mutable = 15
    mutable = 16

    val oneToTen = 1..10

    for (i in 100 downTo 1 step 2) {
        println(i)
    }

    val list = arrayListOf("10", "11", "1001")
    for((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun min(a: Int, b: Int): Int = if (a < b) a else b

fun implicitReturnTypeMin(a: Int, b: Int) = if (a < b) a else b

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c:Char) = c !in '0'..'9'