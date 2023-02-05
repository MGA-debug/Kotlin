package final_task

/**
@author gordeev-ma 02.02.2023
 **/

fun main(args: Array<String>) {
    val aircrafts: ArrayList<Aircraft> = ArrayList()
    aircrafts.add(PassengerAircraft("Boeing 777",15000.00,181282.00,300))
    aircrafts.add(CargoPlane("ИЛ-76",4000.00,109000.00,50.00))
    aircrafts.add(AgriculturalPlane("СУ-38",300.00,181282.00,500.00))

    val airline = Airline()
    airline.getInfo(aircrafts)
}