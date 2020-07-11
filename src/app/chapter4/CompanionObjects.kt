package app.chapter4

import app.chapter1.Person

class UserEntity private constructor(val nickname: String) {
    // factory methods
//    companion object {
//        fun newSubscribingUser(email: String) = UserEntity(email.substringBefore('@'))
//    }

    companion object Loader {
        fun fromJSON(json: String): Person = Person("serialized from JSON")
    }
}

fun UserEntity.Loader.anotherFunction() {}