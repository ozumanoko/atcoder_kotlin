import kotlin.math.*

fun main(){
    var (N, Y) = readLine()!!.split(" ").map{it.toInt()}
    var yen: Double= Y.toDouble()
    var flg = false

    for(i in 0 until N+1) {
        for (j in 0 until N + 1 - i) {
            if (10.0.pow(4) * i + 5.0 * 10.0.pow(3) * j + 10.0.pow(3) * (N - i - j) == yen) {
                println("$i $j ${N - i - j}")
                flg = true
                break
            }
        }
        if (flg) {
            break
        }
    }
    if(!flg){
        println("-1 -1 -1")
    }
}