package Chapter2

val aString: String = "Hello"
val charString: String = String(charArrayOf('H','e','l','l','o'))

fun main(args: Array<String>) {

    /*判断是否值相等，类似于Java中的equal*/
    println(aString == charString)

    /*判断是否是用一个对象*/
    println(aString === charString)

    val a:Int = 1;
    val b:Int = 0
    println("$a + $b = ${a + b }")
    println()

    println("Hello \"lance\"")
    val salary: Int = 1000
    val raw:String = """
        \t
        \n
        lance
        """
    println(raw + "raw.length="+raw.length)
}

