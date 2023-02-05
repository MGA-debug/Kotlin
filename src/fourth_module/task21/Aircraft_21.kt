package fourth_module.task21

/**
@author gordeev-ma 31.01.2023
 **/
abstract class Aircraft_21(_number: String,
                           _flyRange: Double,
                           _tankVolume: Double) {
    private val number: String = _number
    private val flyRange: Double = _flyRange
    private val tankVolume: Double = _tankVolume
    private var fuelConsumption: Double = 0.0
}