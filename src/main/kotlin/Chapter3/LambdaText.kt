package Chapter3

//int,int -> int
val sumx = {x:Int,y:Int ->
    println("$x + $y = ${x+y}")
    x + y
}

//() -> Unit
val printlnHello = {
    println("hello world")
}

fun main(args: Array<String>) {
    println(sumx(1,3))
    println(sumx.invoke(1,2))

    args.forEach { println(it)}
    args.forEach(::println)

    args.forEach ForEach@{
        if(it=="q")return@ForEach
        println(it)
    }
}