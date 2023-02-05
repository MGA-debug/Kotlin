package second_module.eighth

/**
@author gordeev-ma 28.01.2023
 **/
class Deposit {
    private var amount: Double = 0.0;
    private var monthCount: Int = 1
    private var percent: Double = 0.0
    private var totalAmount: Double = 0.0
    private var monthProfit: Double = 0.0
    private var percentInMonth: Double = 0.0;

    fun getDepositInfo() {
        println("Введите сумму депозита")
        amount = readLine()!!.toDouble()
        totalAmount = amount;
        println("Укажите длительность (в месяцах)")
        monthCount = readLine()!!.toInt()
        println("Укажите процентную годовую ставку")
        percent = readLine()!!.toDouble()
        percentInMonth = percent / 12
        println("Информация по вкладу:")
        calculate()
    }

    private fun calculate() {
        for (i in 1..monthCount) {
            monthProfit = totalAmount * percentInMonth / 100
            totalAmount += monthProfit
            println(
                """Месяц $i
                   Прибыль за месяц: ${String.format("%.2f", monthProfit)}
                   Общая сумма вклада:${String.format("%.2f", totalAmount)}""")
            println("__________________________________________________")
        }
    }
}