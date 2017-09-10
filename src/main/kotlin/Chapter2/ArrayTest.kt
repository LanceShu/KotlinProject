package Chapter2

val arrayOfInt: IntArray = intArrayOf(1,3,5,7,9)
val arrayOfChar: CharArray = charArrayOf('h','e','l','l','o')
val arratyOfString: Array<String> = arrayOf("wo","shi","manong")

fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for(i in arrayOfInt){
        print("${i} ")
    }
    println()

    println(arrayOfChar[1])

    /*属性作用：separator:每个字符的连接方式
    *           prefix:字符开头前添加的字符串
    *           postfix:字符结尾后添加的字符串
    *           limit:显示的字符个数
    *           truncated:剩余字符没被显示出来的字符样式*/
    println(arrayOfChar.joinToString(".","lance\t","\tshu",2, ""))

    println(arrayOfInt.slice(1..2))
}