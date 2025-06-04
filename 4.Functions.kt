fun hello(name: String = "world"): String {
    return "Hello, $name!"
}

fun main() {
    println(hello("foo"))
    println(hello(name = "bar"))
    println(hello())
}

/*
Output:

Hello, foo!
Hello, bar!
Hello, world!
* */