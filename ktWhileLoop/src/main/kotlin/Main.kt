fun main() {

    println("Hello World")

    var i = 0
    while (i < 5) {
        println(i)
        i++
    }
    println()

    i = 0
    do {
        println(i)
        i++
    } while (i < 5)
    println()

    var myAge = 16
    while (myAge < 20) {
        println("I am a teenager.")
        myAge += 1
    }
    println("I am not a teenager.")
    println()

    myAge = 11
    while (myAge > 12 && myAge < 20) {
        println("I am a teenager.")
        myAge += 1
    }
    println("I am not a teenager.")
    println()

    val myCondition = false
    do {
        println("I loop once!")
    } while(myCondition)
    println()

    for (i in 1..2) {
        for (j in 'A'..'C') {
            println("Outer loop: $i - Inner loop: $j")
        }
    }
    println()

    val myNumbers = listOf(4, 8, 2, 9, 12, 7, 16, 10, 3)
    for (num in myNumbers) {
        if (num > 9) {
            break
        }
        println(num)
    }
    println()

    for (num in myNumbers) {
        if (num > 9) {
            continue
        }
        println(num)
    }

}