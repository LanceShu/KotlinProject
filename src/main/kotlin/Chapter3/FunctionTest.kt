package Chapter3

fun main(args: Array<String>) {
    checkArgs(args)
    val x = args[0].toInt()
    val y = args[1].toInt()
    println("$x + $y = ${sum(x,y)}")
}

fun checkArgs(args: Array<String>){
    if(args.size < 2){
        println("请至少传入两个整型参数！！")
        System.exit(0)
    }
}

fun sum(x: Int,y:Int): Int = x + y