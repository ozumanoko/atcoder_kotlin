fun main() {
    var a = readLine()!!.toInt()
    var (b, c) = readLine()!!.split(" ").map{it.toInt()}
    var s = readLine()!!
    var ans = a + b + c
    println("$ans $s")
}
