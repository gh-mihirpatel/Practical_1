fun main() {
    val number = 4
    val result: Long
    result = factorial(number)
    println("Factorial without using tailrec!")
    println("Factorial of $number = $result")

    val number2 = 5
    println("Factorial using tailrec!")
    println("Factorial of $number = ${factorial(number)}")
}

fun factorial(n: Int): Long {

    if (n == 1) {
        return n.toLong()
    } else {
        return n*factorial(n - 1)
    }
}



tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}

