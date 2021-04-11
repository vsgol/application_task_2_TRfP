import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


fun main() {
    println("Write the path to the python executable")
    val executable = readLine()
    val process = Runtime.getRuntime().exec("$executable -m timeit -r 10")

    GlobalScope.launch {
        var i = 0
        while (true) {
            delay(1000)
            i++
            println("The programme is running for $i seconds")
        }
    }

    print(process.inputStream.bufferedReader().readText())
}