fun main() {
    println("Hello World")

    // This example jumps out of the loop when i is equal to 4
    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }

    // This example skips the value of 4
    i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }
}