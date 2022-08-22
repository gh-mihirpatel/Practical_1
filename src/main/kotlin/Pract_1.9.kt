fun main() {
    val numArray = arrayOf(23, 34, 50, 33, 55, 43, 5, 6)
    var largest = numArray[0]

    for (num in numArray) {
        if (largest < num)
            largest = num
    }

    println("Largest element = $largest")
}