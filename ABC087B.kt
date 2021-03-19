fun main(){
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()
    var x = readLine()!!.toInt()

    var cnt = 0

    for(i in 0 until a+1){
        for(j in 0 until b+1){
            for(k in 0 until c+1){
                if(i*500 + j*100 + k*50 == x){cnt++}
            }
        }
    }

    println(cnt)
}