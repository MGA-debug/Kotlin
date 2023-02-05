package third_module

import kotlin.math.sqrt

/**
@author gordeev-ma 29.01.2023
 **/

fun main(args: Array<String>) {

}

//12
fun checkLeapYear(year: Int): Boolean {
    return year % 4 == 0
}

//13
fun getCountEmployee(vararg employee: String): Int {
    return employee.size
}

//14
fun getInfo(fullName: String, position: String) {
    println("Информация о сотруднике:\nФИО: $fullName\nДолжность: $position")
}

fun getInfo(fullName: String, age: Int, position: String) {
    println("Информация о сотруднике:\nФИО: $fullName\nВозраст: $age\nДолжность: $position")
}

fun getInfo(fullName: String, familyStatus: String, position: String) {
    println("Информация о сотруднике:\nФИО: $fullName\nСемейное положение: $familyStatus\nДолжность: $position")
}

fun getInfo(fullName: String, age: Int, familyStatus: String, position: String) {
    println("Информация о сотруднике:\nФИО: $fullName\nВозраст: $age\nСемейное положение: $familyStatus\nДолжность: $position")
}

//15
val printArray = { array: Array<String> -> for (el in array) println(el) }

//16
fun Double.sqr(): Double {
    return sqrt(this)
}