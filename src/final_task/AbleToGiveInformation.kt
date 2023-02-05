package final_task

import kotlin.streams.toList

/**
@author gordeev-ma 02.02.2023
 **/
interface AbleToGiveInformation {

    fun getInfo(airplanes: ArrayList<Aircraft>) {

        while (true) {
            getMenu()
            var option: String = readLine()!!.substring(0, 1)
            when (option) {
                "1" -> {
                    println("Общее количество самолетов: ${airplanes.size}")
                    print(airplanes)
                }
                "2" -> {
                    val cargoPlanes: List<Aircraft> = filterAirPlanes(airplanes, "CargoPlane")
                    println("Общее количество грузовых самолетов: ${cargoPlanes.size}")
                    print(cargoPlanes)
                }
                "3" -> {
                    val passengerAirplanes: List<Aircraft> = filterAirPlanes(airplanes, "PassengerAircraft")
                    println("Общее количество пассажирских самолетов: ${passengerAirplanes.size}")
                    print(passengerAirplanes)
                }
                "4" -> {
                    val agriculturalPlanes: List<Aircraft> = filterAirPlanes(airplanes, "AgriculturalPlane")
                    println("Общее количество c/х самолетов: ${agriculturalPlanes.size}")
                    print(agriculturalPlanes)
                }
                "5" -> {
                    return
                }
                else -> {
                    print("\nВыберите пункт меню из списка")
                }
            }
        }
    }

    private fun getMenu() {
        println(
            """
            Выберите пункт меню:
            1. Общее количество самолетов в авиапарке и ифномация о них
            2. Информация о грузовых самолетах
            3. Информация о пассажирских самолетах
            4. Информация о с/х самолетах
            5. Выход
        """.trimIndent()
        )
    }

    private fun print(airplanes: List<Aircraft>) {
        for (element in airplanes) {
            println(element)
        }
    }

    private fun filterAirPlanes(airplanes: List<Aircraft>, type: String): List<Aircraft> {
        return airplanes.stream().filter { it.javaClass.simpleName == type }.toList()
    }
}