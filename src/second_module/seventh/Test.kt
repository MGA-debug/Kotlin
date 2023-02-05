package second_module.seventh

/**
@author gordeev-ma 26.01.2023
 **/
class Test {
    private var result: Int = 0;

    private val firstQ: String = """
        Сколько колес у двухколесного велосипеда:
        1. 1
        2. 2
    """.trimIndent()

    private val secondQ: String = """
        Сколько месяцев в году:
        1. 12
        2. 122
    """.trimIndent()

    private val thirdQ: String = """
        Какое животное мяукает:
        1. Корова
        2. Кот/кошка
    """.trimIndent()

    private val fourthQ: String = """
        Есть ли газы в газированной воде:
        1. Да
        2. Нет
    """.trimIndent()

    private val fifthQ: String = """
        Полное имя Вовы:
        1. Владимир
        2. Вальдемар
    """.trimIndent()

    fun startTest() {
        getQuestion()
        getResult()
    }

    private fun getQuestion() {
        println("Стартуем!")
        println(firstQ)
        result = if (readLine()!!.startsWith("1")) result++ else result
        println(secondQ)
        result = if (readLine()!!.startsWith("1")) result++ else result
        println(firstQ)
        result = if (readLine()!!.startsWith("2")) result++ else result
        println(fourthQ)
        result = if (readLine()!!.startsWith("1")) result++ else result
        println(fifthQ)
        result = if (readLine()!!.startsWith("1")) result++ else result
    }

    private fun getResult() {
        when(result) {
            0,1 -> println("Все плохо :(")
            2,3 -> println("Терпимо")
            4 -> println("Неплохо")
            5 -> println("Превосходно")
        }
    }
}