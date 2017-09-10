package Chapter2

val range: IntRange = 0..1024       //[0,1024]
val anotherRange: IntRange = 0 until 1024       //[0,1024) == [0,1023]

val emptyRange: IntRange = 0..-1

fun main(args: Array<String>) {
    println(emptyRange.isEmpty())
    println(range.contains(500))
    println(50 in range)

    for(i in anotherRange){
        print("$i,")
    }
}