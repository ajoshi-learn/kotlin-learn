package app.chapter6

fun sendEmailTo(email: String) {}

fun main(args: Array<String>) {
    val email: String? = "5"
    email?.let { s -> sendEmailTo(s) }
}