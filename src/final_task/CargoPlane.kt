package final_task

/**
@author gordeev-ma 02.02.2023
 **/
data class CargoPlane(
    var _number: String, var _flyRanger: Double, var _tankVolume: Double, override var loadCapacity: Double
) : Aircraft(_number, _flyRanger, _tankVolume), LoadBearing {

    override fun toString(): String {
        return "Грузовые самолеты: \nНомер борта:'$_number'\n " +
                "Максимальная дальность полета:$_flyRanger\n " +
                "Объем топливного бака:$_tankVolume\n " +
                "Максимальная грузоподъемность=$loadCapacity\n" +
                "__________________________________________________"
    }
}