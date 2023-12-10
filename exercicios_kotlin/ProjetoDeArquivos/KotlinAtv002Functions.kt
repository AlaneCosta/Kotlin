fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // 4

fun main() {
    printMessage("Alane no Kotlin")                                               // 5                    
    printMessageWithPrefix("Mensagem", "Prefixo")                              // 6
    printMessageWithPrefix("Sem passar prefixo")                                     // 7
    printMessageWithPrefix(prefix = "Prefixo", message = "Prefixo passado antes")           // 8
    println(sum(5, 9))                                                  // 9
    println(multiply(7, 4))                                             // 10
}
