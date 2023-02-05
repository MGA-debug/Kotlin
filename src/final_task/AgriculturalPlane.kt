package final_task

/**
@author gordeev-ma 02.02.2023
 **/
data class AgriculturalPlane(
    var _number: String, var _flyRanger: Double, var _tankVolume: Double, var pesticideTankVolume: Double
) : Aircraft(_number, _flyRanger, _tankVolume) {

    override fun toString(): String {
        return "Сельскохозяйственные самолеты:\nНомер борта:'$_number'\n " +
                "Максимальная дальность полета:$_flyRanger\n " +
                "Объем топливного бака:$_tankVolume\n " +
                "Объем бака для пестицидов=$pesticideTankVolume\n" +
                "__________________________________________________"
    }
}