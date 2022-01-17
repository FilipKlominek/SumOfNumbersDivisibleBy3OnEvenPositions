fun main() {
    val input = readLine()!!
    var switch = false
    var sum = 0
    for (i in input) {
        switch = switch.not()
        if (switch && i.toString().toInt() % 3 == 0) sum += i.toString().toInt()
    }
    println(sum)
}