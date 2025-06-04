fun main() {
    var fooNullable: String? = "abc"
    println(fooNullable?.length)        // Safe call
    println(fooNullable?.length ?: -1)  // Elvis operator

    fooNullable = null
    println(fooNullable?.length)        // => null
    println(fooNullable?.length ?: -1)  // => -1
}
/*
Output:

3
3
null
-1

* */

