class Car(type:String, model:String, owner:String, miles:Int, price:Int, cprice:Int){
    var Type:String = type
    var Model =model
    var Owner = owner
    var Miles:Int = miles
    var Price:Int = price
    var CPrice:Int = cprice

    fun getCarPrice(){
        println("Car Information: $Type , $Model\nCar Owner: $Owner\nMiles Driven: $Miles\nOriginal Car Price: $Price, Current Car Price: $CPrice ")
    }
}
fun main() {
    var cars = arrayOf(Car("BMW","2018","Aman",105,100000, 98950),
        Car("BMW","2019","Karan",20,400000, 399800),
        Car("Toyota","2017","KJS",100,1080000, 1079000),
        Car("Maruti", "2020", "NPP", 200, 4000000, 3998000))
    println("Creating Car Class Object car1 in next line")
    println("Object of class is created and Init is called.\n-----")
    for (i in cars){
        i.getCarPrice()
    }
}