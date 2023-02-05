package final_task

/**
@author gordeev-ma 02.02.2023
 **/
abstract class Aircraft(
    _number: String,
    _flyRange: Double,
    _tankVolume: Double
) {
    private val number: String = _number
    private val flyRange: Double = _flyRange
    private val tankVolume: Double = _tankVolume
    private var fuelConsumption: Double = 0.0
}