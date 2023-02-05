package fourth_module.task19

import fourth_module.task18.Aircraft_18

/**
@author gordeev-ma 29.01.2023
 **/
class Aircraft_19(_number: String,_flyRange: Double, _tankVolume: Double, _passengerCapacity: Int): Aircraft_18(_number,_flyRange,_tankVolume) {
    val passengerCapacity: Int = _passengerCapacity
}