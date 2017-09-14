package Chapter3

val x = "x"         //运行时常量
const val y = "y"   //编译期常量，在编译的时候就知道y的值为多少，在程序运行时，效率会提高；

var z = 123

fun main(args: Array<String>): Unit{

    println("Hello ${args[0]}")

    println(x)
    println(y)

    z = 456
    println(z)
}