fun main(){
    var n = readLine()!!.toInt()
    var nums = readLine()!!.split(" ").map{it.toInt()}.toMutableList()
    var cnt = -1
    var flag = true
    while(flag){
        cnt += 1
        for(i in 0 until n){
            if(nums[i] % 2 == 0){
                nums[i] /=2
            }else{
                flag = false
                break
            }
        }
    }
    println(cnt)
}