fun main() {
    val fooString = "My String Is Here!"
    val barString = "Printing on a new line?\nNo Problem!"
    val bazString = "Do you want to add a tab?\tNo Problem!"

    println(fooString)
    println(barString)
    println(bazString)

    val fooRawString = """
        fun helloWorld(val name : String) {
           println("Hello, world!")
        }
    """
    println(fooRawString)

    val fooTemplateString = "$fooString has ${fooString.length} characters"
    println(fooTemplateString)
}
/*
Output:

My String Is Here!
Printing on a new line?
No Problem!
Do you want to add a tab?	No Problem!

        fun helloWorld(val name : String) {
           println("Hello, world!")
        }

My String Is Here! has 18 characters

* */


