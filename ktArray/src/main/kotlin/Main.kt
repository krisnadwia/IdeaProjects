fun main() {
    println("Hello World")

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0]) // Outputs Volvo
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    for (x in cars) {
        println(x)
    }

    cars[0] = "Opel"
    println(cars[0]) // Outputs Opel
    println(cars.size)
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    for (x in cars) {
        println(x)
    }


    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }
}