package final_task

import Passenger

/**
@author gordeev-ma 02.02.2023
 **/
data class PassengerAircraft(
    var _number: String,var _flyRanger: Double,var _tankVolume: Double, override val passengerCapacity: Int
) : Aircraft(_number, _flyRanger, _tankVolume), Passenger {

    override fun toString(): String {
        return "Пассажирские самолеты:\nНомер борта:'$_number'\n " +
                "Максимальная дальность полета:$_flyRanger\n " +
                "Объем топливного бака:$_tankVolume\n " +
                "Максимальная пассажировместимость=$passengerCapacity\n" +
                "__________________________________________________"
    }
}