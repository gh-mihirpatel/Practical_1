fun main()
{

    var a: Int = 10
    var b: Int = 20
    var temp: Int? = null
    println("With using third variable!")
    println("Before swapping")
    println("The value of a is $a and b is $b ")

    temp=a
    a=b
    b=temp

    println("After swapping")
    println("The value of a is $a and b is $b")

    println("**********************************")

    a=10
    b=20
    println("Without using third variable!")
    println("Before swapping")
    println("The value of a is $a and b is $b ")

    a=a+b
    b=a-b
    a=a-b

    println("After swapping")
    println("The value of a is $a and b is $b")








}




