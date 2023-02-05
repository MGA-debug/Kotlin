package second_module.ninth

/**
@author gordeev-ma 28.01.2023
 **/

fun main(args: Array<String>) {
    val array: Array<Array<String>> = arrayOf(
        arrayOf("Россия", "Сербия", "CША"),
        arrayOf("Москва", "Белград", "Вашингтон"),
        arrayOf("Рубль", "Сербский динар", "Доллар США")
    )

    for (i in array.indices) {
        for (t in array[i].indices) {
            print(array[t][i].plus(" "))
        }
        println()
    }
}