package fourth_module.task18

/**
@author gordeev-ma 29.01.2023
 **/
open class Aircraft_18(_number: String,_flyRange: Double, _tankVolume: Double) {
    private val number: String = _number
    private val flyRange: Double = _flyRange
    private val tankVolume: Double = _tankVolume
    private var fuelConsumption: Double = 0.0

    fun getFuelConsumption() : Double {
        this.fuelConsumption = flyRange / tankVolume
        return fuelConsumption
    }
}