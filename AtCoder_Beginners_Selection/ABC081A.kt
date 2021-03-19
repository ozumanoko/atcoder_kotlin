fun main(){
    var a = readLine()!!
    var ans = 0
    for(s in a){
        if("$s" == "1"){
            ans++
        }
    }
    println(ans)
}