fun main(){
    val S = readLine()!!
    var word = S.reversed()
    var i = 0
    var ans = "YES"
    while(i < word.length){
        if(i+6 < word.length) {
            if (word.substring(i, i + 7) == "remaerd") {
                i += 7
                //print(7)
                continue
            }
        }

        if(i+5 < word.length){
            if(word.substring(i,i+6) == "resare"){
                i+=6
                //print(6)
                continue
            }
        }

        if(i+4 < word.length){
            if(
                word.substring(i,i+5) == "maerd"
                || word.substring(i,i+5) == "esare"
            ){
                i+=5
                //print(5)
                continue
            }
        }

        ans = "NO"
        break
    }
    println(ans)
}