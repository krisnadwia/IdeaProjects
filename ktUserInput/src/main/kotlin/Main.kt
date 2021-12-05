fun main() {
    print("Masukkan user password: ")
    var userPassword = readLine()
    var attemptedPassword = "blackhero777"
    if (userPassword == attemptedPassword) {
        println("Password Benar!")
    } else {
        println("Password Salah!")
    }
}