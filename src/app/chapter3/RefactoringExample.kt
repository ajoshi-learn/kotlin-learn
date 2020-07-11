package app.chapter3

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

// step 0
//fun saveUser(user: User) {
//    if(user.name.isEmpty()) throw IllegalArgumentException("Can't save user ${user.id}: empty name!")
//    if(user.address.isEmpty()) throw IllegalArgumentException("Can't save user ${user.id}: empty address!")
//}


// step 1
//fun saveUser(user: User) {
//    fun validate(value: String, fieldName: String) {
//        if(value.isEmpty()) throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
//    }
//    validate(user.name, "Name")
//    validate(user.address, "Address")
//}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) throw IllegalArgumentException("Can't save user $id: empty $fieldName")
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()
    // save to DB
}