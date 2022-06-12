fun main(arg: Array<String>) {
    println("Please Enter your name:")
    var name = readLine()
    println("Please enter your age:")
    var age: Int = readLine()!!.toInt()

    println("Your name is: $name and your age is $age")

}