fun main(args:Array<String>){
    println("Please enter the first number")

    var n1:Int = readLine()!!.toInt()
    println("Please enter the second number")

    var n2:Int = readLine()!!.toInt()


    var sum:Float = (n1+n2).toFloat()
    println("Sum of the number: $sum")


    var dif:Float = (n1-n2).toFloat()
    println("dif of the number: $dif")

    var mul:Float = (n1*n2).toFloat()
    println("mul of the number: $mul")

    var div:Float = (n1/n2).toFloat()
    println("div of the number: $div")

}