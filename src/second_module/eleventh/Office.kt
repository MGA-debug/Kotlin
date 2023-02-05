package second_module.eleventh

/**
@author gordeev-ma 28.01.2023
 **/
class Office {
    private var places: MutableMap<Int, String> = mutableMapOf(22 to "Семенов Семен Семенович", 33 to "Эдуардов Эдуард Эдуаржович")

    fun getInfo(number: Int): String? {
        var info: String;
        info = if (!places.containsKey(number))
            "На месте $number никто не сидит"
        else
            places[number].toString();
        return info;
    }
}