package fourth_module.task20

import Passenger

/**
@author gordeev-ma 31.01.2023
 **/
class Aircraft_20(
    _number: String,
    _flyRange: Double,
    _tankVolume: Double,
    override val passengerCapacity: Int
) : Passenger {
    private val number: String = _number
    private val flyRange: Double = _flyRange
    private val tankVolume: Double = _tankVolume
    private var fuelConsumption: Double = 0.0

}