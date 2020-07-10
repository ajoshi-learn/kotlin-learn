package app.chapter3

fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 52)
    val list = listOf(1, 7, 52)
    val map = hashMapOf(1 to "one", 7 to "seven")
    println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))
    println(list.joinToString())
    println("Kotlin".lastChar())
    println("Kotlin".lastChar)
}

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "(",
    postfix: String = ")"
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = this.get(this.length - 1)

val String.lastChar: Char get() = get(length - 1)