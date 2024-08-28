/*In this exercise, you write a program that performs basic math operations and prints the output.

Step 1
This main() function contains one compile error:


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
}
Can you fix the error so that the program prints this output?
 */
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}
fun add (num1: Int,num2:Int): Int{
    return num1+num2
}