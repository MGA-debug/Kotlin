package fourth_module.task22

import Passenger

/**
@author gordeev-ma 31.01.2023
 **/

abstract class Aircraft(_number: String,
                        _flyRange: Double,
                        _tankVolume: Double) {
    protected val number: String = _number
    protected val flyRange: Double = _flyRange
    protected val tankVolume: Double = _tankVolume

    protected open fun getInfo(): String {
        return """
            Номер рейса: $number
            Максимальная дальность полета: $flyRange
            Объем топливного бака: $tankVolume
        """.trimIndent()
    }
}

class Boeing747(_number: String,_flyRange: Double, _tankVolume: Double, override val passengerCapacity: Int): Aircraft(_number,_flyRange, _tankVolume),
    Passenger {

    override fun getInfo(): String {
        return super.getInfo() + "\nПассажировместимость: $passengerCapacity"
    }
}