package Chapter3

class A{
    var a = 0
    var b = ""

    //var 可用 lateinit 延迟初始化；
    //val 可用 lazy{} 进行延迟初始化;
    lateinit var c: String
    val e:String by lazy {
        println("init String")
        String()
    }
}

fun main(args: Array<String>) {
    val a = A()
    a.c = "123"
    println(a.c)
    println(a.e)
}