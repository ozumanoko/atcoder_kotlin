fun main(){
    var N = readLine()!!.toInt()
    var nums = readLine()!!.split(" ").map{it.toInt()}.toMutableList()

    nums.sortDescending()

    var alice = 0
    var bob = 0
    for(i in 0 until N){
        if(i % 2 == 0){
            alice += nums[i]
        }else{
            bob += nums[i]
        }
    }
    println(alice - bob)
}