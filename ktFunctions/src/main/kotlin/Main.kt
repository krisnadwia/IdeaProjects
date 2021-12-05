fun myFunction() {
    println("I just got executed!")
}

fun myFunction2(fname: String) {
    println(fname + " Krisna")
}

fun myFunction3(fname: String, age: Int) {
    println(fname + " is " + age)
}

fun myFunction4(x: Int): Int {
    return (x + 5)
}

fun myFunction5(x: Int, y: Int): Int {
    return (x + y)
}

fun myFunction6(x: Int, y: Int) = x + y

fun main() {
    myFunction()
    myFunction()
    myFunction()

    myFunction2("Dwi")
    myFunction2("Andrianto")

    myFunction3("Dwi", 19)
    myFunction3("Andrianto", 19)

    var result = myFunction4(3)
    println(result)

    var result2 = myFunction5(3, 5)
    println(result2)

    var result3 = myFunction6(3, 5)
    println(result3)
}