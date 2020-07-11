package app.chapter5

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    people.maxBy { it.age } // lambda expression is always in curly braces
    people.maxBy(Person::age)

    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
}

fun alphabet(): String {
    return with(StringBuilder()) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nThat's the alphabet")
        toString()
    }
}

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nThat's the alphabet")
}.toString()