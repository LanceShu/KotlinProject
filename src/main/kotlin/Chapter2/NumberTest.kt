package Chapter2

val a:Int = 0xFF
val b:Int = 0b00000001
val c:Int = Int.MAX_VALUE
val d:Int = Int.MIN_VALUE

fun main(args: Array<String>) {
    println(a)
    println(b)
    println()

    /*int值为2位的*/
    println(c)
    println(Math.pow(2.0,31.0)-1)
    println(d)
    println(-Math.pow(2.0,31.0))
    println()

    /*long的值为64位的*/
    println(Long.MAX_VALUE)
    println(Math.pow(2.0,63.0)-1)
    println(Long.MIN_VALUE)
    println(-Math.pow(2.0,63.0))
    println()

    println(2.0F)
    println(1E3F)
    println(0.0f/0.0f == Float.NaN)
    println()
}