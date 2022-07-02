fun main() {
    val amount = 1001
    val isRegular = true
    val discount = 100
    val discountFirst = 1000
    val discountSecond = 10_000

    if (amount > discountFirst && amount <= discountSecond) {
        val resoult = if (isRegular) (amount - discount) * 99 / 100 else amount - discount
        println("Цена со скидкой $resoult")
    } else if (amount > discountSecond) {
        val resoult = if (isRegular) (amount * 95 / 100) * 99 / 100 else amount * 95 / 100
        println("Цена со скидкой $resoult")
    } else {
        val resoult = amount
        println("Цена без скидки $resoult")
    }
}