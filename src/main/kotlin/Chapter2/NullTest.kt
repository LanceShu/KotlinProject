package Chapter2

fun getName(): String? {
    return null
}

fun main(args: Array<String>) {
    val name = getName()?:return
    println(name.length)
}