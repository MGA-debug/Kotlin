package first_module

/**
@author gordeev-ma 28.01.2023
 **/

fun main(args: Array<String>) {
    // 1
    var example: Any? = null
    example = 1
    var example2 = example / 2.5 // double

    // 2
    val hello: String = "Hello"
    val aplana: String = "Aplana"
    println("$hello $aplana")

    // 3
    val five: Char = '1'
    val str: String = five.toString()
    val b: Byte = five.toByte()
    val sh: Short = five.toShort()
    val i: Int = five.toInt()
    val d: Double = five.toDouble()
    val l: Long = five.toLong()

    // 4
    println("Как вас зовут?")
    val name: String? = readLine()
    println("Hello $name")

    // 5
    val alphabet = 'z' downTo 'a'

    // 6
    println("Введите два числа")
    val number: Int = readLine()!!.toInt()
    val number2: Int = readLine()!!.toInt()
    var bol: Boolean = number > number2
}