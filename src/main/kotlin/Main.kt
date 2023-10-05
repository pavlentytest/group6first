import java.util.*

fun main() {
    val (a, b, m, n) = readln().split(" ").map { it.toDouble() }
    println(if((a >= m && b >= n) || (a >= n && b >= m)) "YES" else "NO")
}



fun calc(a: Int, b: Int) : Int {
    return a+b
}

fun calc2(a: Int, b: Int) = if(a>b) 3 else 5



fun main2() {

    val (p,y,m,n) = readln().split(" ").map { it.toInt() }

    val sc = Scanner(System.`in`)
    val number = sc.nextInt()

    val nums = 1..10 // Range [1,10]
    for(i in nums) {
        println(i)
    }
    val numbers = arrayOf(1,2,3,10,234234)
    for(i in numbers.indices) {
        println(numbers[i])
    }

    println("p=${p+calc(2,3)}, y=${y+200}")
    println("$p $y")

    // javac
    println("Hello world!")
    // JVM - Java Virtual Machine
    // Она запускает byte code
    // MainKt.class
    // Linux (Unix), MacOS, Windows
    // JVM входит в JDK
    // Java Development Kit (21 Java (JVM))

    var x: Int? = 100
    x = 200
    x = null

    var b: String? = "abc"
    b = null //
    //val l = b?.length

   // val l = if (b != null) b.length else -1

    val l = b?.length ?: -1 // (Elvis expression)

    val result = if(p>100) 10 else 20
    val result2 = when{
        p in nums -> println("123123")
        else -> println("wefsdfsf")
    }
    when(p) {
        1,2,3,4 -> {
            if (y==2) {

            }
        }
        0 -> println("234234")
    }
    /*while() {

    }
    do {

    }while()*/
    repeat(5) {

    }
    for(j in 100 downTo 50 step 3) {
        //println
    }




}