fun main() {
    var (n, a, b) = readLine()!!.split(" ").map{it.toInt()}

    var ans = 0

    for(i in 1..n){
        var num = i.toString().split("").filter{it != ""}.map{it.toInt()}
        var num_sum = num.sum()
        if(a <= num_sum && num_sum <= b){ans += i}
    }
    println(ans)
}