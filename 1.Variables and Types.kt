fun main() {
    val fooVal = 10 // Immutable
    var fooVar = 10 // Mutable
    fooVar = 20

    val foo: Int = 7

    println("fooVal: $fooVal")
    println("fooVar: $fooVar")
    println("foo (with type): $foo")
}

/*
Output:

fooVal: 10
fooVar: 20
foo (with type): 7
*/