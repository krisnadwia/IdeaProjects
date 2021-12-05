fun main() {
    // This is a comment
    /* The code below will print the words Hello World to the screen, and it is amazing */
    println("Hello World!")
    println("I'm learning Kotlin!")
    println("It's awesome!")
    println(3 + 3)
    print("Hello World! ")
    print("I'm learing Kotlin ")
    print("It's awesome! ")
    println("")

    /* The difference between var and val is that variables declared with the var keyword can be changed/modified,
    while val variables cannot. */
    /* Unlike many other programming languages, variables in Kotlin do not need to be declared with a specified type
    (like "String" for text or "Int" for numbers, if you are familiar with those). */

    /* To create a variable in Kotlin that should store text and another that should store a number, look at the following example: */
    var firstName = "Krisna" // String (text)
    val birthYear = 2001 // Int (number)
    var secondName: String
    secondName = "Dwi"
    var lastName: String = "Andrianto"
    firstName = "Krisna DA"
    val fullName = firstName.plus(secondName).plus(lastName)

    println(firstName) // Print the value of name
    println(birthYear) // Print the value of birthyear
    println(secondName)
    println(lastName)
    println("Nama saya $firstName $secondName $lastName")
    println(fullName)

    val x = 5
    val y = 6

    println(x + y)

    val myNum: Int = 5              // Int
    val myDoubleNum: Double = 5.99  // Double
    val myLetter: Char = 'D'        // Char
    val myBoolean: Boolean = true   // Boolean
    val myText: String = "Hello"    // String

    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText)

    val a: Int = 5
    val b: Long = x.toLong()

    println(b)      // b = 5

    var sum1 = 100 + 50
    var sum2 = sum1 + 250
    var sum3 = sum2 + sum2

    println(sum1)
    println(sum2)
    println(sum3)

    var d = 10
    d += 5      // Same As d = d + 5 -> 15
    d *= 2      // 15 * 2

    println(d)  // d = 30
    println(x == y)     // x = 5
    println(x != y)     // y = 6
    println(d > b)      // d = 30
    println(d < b)      // b = 5
    println(d >= b)
    println(d <= b)
    println(d > 5 && d < 35) // benar keduanya = true
    println(!(d > 5 && d < 35)) // benar keduanya = false
    println(b > 4 && b > 10) // benar satu, salah satu = false
    println(d < 35 || d < 5) // benar satu, salah satu = true
    println(b > 10 || b < 4) // tidak ada yang benar = false

    var txt = "Hello World"
    println(txt[0])     // first element (H)
    println(txt[1])     // second element (e)
    println(txt[2])     // third element (l)
    println("The length of the txt string is: " + txt.length)
    println(txt.toUpperCase())
    println(txt.toLowerCase())

    var txt1 = "Hello World"
    var txt2 = "Hello World"
    var txt3 = "Hello"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)
    println(txt1.compareTo(txt3))  // Outputs 6 (they aren't equal)
}