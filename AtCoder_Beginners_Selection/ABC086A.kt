fun main() {
    var (a, b) = readLine()!!.split(" ").map{it.toInt()}
    if (a % 2 == 0 || b % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}
