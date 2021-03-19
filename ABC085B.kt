fun main() {
    val N = readLine()!!.toInt()
    var mochis = mutableSetOf<Int>()
    for(i in 0 until N){
        mochis.add(readLine()!!.toInt())
    }
    println(mochis.size)
}