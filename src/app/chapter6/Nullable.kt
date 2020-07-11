package app.chapter6

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee) = employee.manager?.name ?: ""