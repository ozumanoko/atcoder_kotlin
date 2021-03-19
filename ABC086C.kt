import kotlin.math.*

fun main() {
    val N = readLine()!!.toInt()
    var maze = (0 until N).map{ readLine()!!.split(" ").map{it.toInt()}}.toMutableList()
    maze.add(0, listOf(0, 0, 0))
    var ans = "Yes"

    for(i in 0 until N){
        var (t, x, y) = maze[i]
        var (t_next, x_next, y_next) = maze[i+1]
        var fastest_time = abs(x_next - x) + abs(y_next - y)
        var time = t_next - t - fastest_time
        //println("$fastest_time, $time, $t, $t_next")

        if(time < 0 || time % 2 == 1){
            ans = "No"
            break
        }
    }
    println(ans)
}