package Chapter2

class Man(name:String,age:Int,sex:String): Peron(name,age,sex)

open class Peron(name:String,age:Int,sex:String){
    init {
        println("create a man,his name is $name,his age is $age,he is $sex")
    }
}

fun main(args: Array<String>) {
    val man = Man("lance",20,"man")
    println(man is Peron)
}