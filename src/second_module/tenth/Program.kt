package second_module.tenth

import java.util.*

/**
@author gordeev-ma 28.01.2023
 **/
class Program {
    private val menu: String = """
        Выберите пункт меню:
        1. Добавить город
        2. Посмотреть все добавленные города
        3. Посмотреть уникальные города
        4. Выход из программы
    """.trimIndent()

    var cities: ArrayList<String> = ArrayList()

    fun start() {
        while (true) {
            println(menu)
            var select = readLine()
            when (select) {
                "1" -> {
                    println("Какой город вы хотите добавить?")
                    addCities(readLine()!!)}
                "2" -> getAllCities()
                "3" -> getUniqueCities()
                "4" -> return
                else -> println("Укажите номер пункта из списка")
            }
        }
    }

    private fun addCities(city: String) {
        cities.add(city);
    }

    private fun getAllCities() {
        println(cities)
    }

    fun getUniqueCities() {
        println(cities.distinct())
    }
}