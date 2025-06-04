fun odd(x: Int): Boolean = x % 2 == 1
fun even(x: Int) = x % 2 == 0

fun not(f: (Int) -> Boolean): (Int) -> Boolean {
    return { n -> !f(n) }
}

fun main() {
    val notOdd = not(::odd)
    val notEven = not(::even)
    val notZero = not { n -> n == 0 }
    val notPositive = not { it > 0 }

    for (i in 0..4) {
        println("${notOdd(i)} ${notEven(i)} ${notZero(i)} ${notPositive(i)}")
    }
}
/*
Output:

true false false true
false true true false
true false true false
false true true false
true false true false
*/
