package fourth_module.task23

/**
@author gordeev-ma 02.02.2023
 **/

fun main(args: Array<String>) {
    println(Car("Nissan","black","к777от77"))
}


data class Car(var brand: String, var color: String, var regNumber: String) {

}