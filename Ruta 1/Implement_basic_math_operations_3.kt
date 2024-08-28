/*Paso 3
Ahora tienes una función reutilizable capaz de sumar dos números.

¿Puedes implementar la función subtract() de la misma manera en que implementaste la función add()? Modifica la función main() también para usar la función subtract(), de modo que puedas verificar que funcione como se espera. */
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}
fun add (num1 : Int,num2 : Int) : Int{
    return num1 + num2
}
fun subtract (num1 : Int, num2 : Int) : Int{
    return num1 - num2
}