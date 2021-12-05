fun main() {
    println("Hello World")

    if (20 > 18) {
        println("20 lebih besar dari 18")
    }

    val a = 5
    val b = 10
    if(a < b) {
        println("a lebih kecil dari b")
    }

    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }   // Outputs "Good evening."

    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }   //Outputs "Good evening."

    val greeting = if (time < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)
}