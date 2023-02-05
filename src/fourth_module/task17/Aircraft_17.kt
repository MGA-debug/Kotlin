package fourth_module.task17

/**
@author gordeev-ma 29.01.2023
 **/
class Aircraft_17 {
    private var number: String = "Boeing 777"
    private var flyRange: Double = 15000.00
    private var tankVolume: Double = 181282.00
    private var fuelConsumption = 111

    fun getFuelConsumption() : Double {
        return flyRange / tankVolume
    }
}