/*Paso 2
El código funciona, pero la lógica para sumar dos números se encuentra dentro de la variable de resultado, lo que hace que el código sea menos flexible a la hora de volver a usarlo. En su lugar, puedes extraer la operación de suma en una función add() para que el código se pueda volver a usar. Para ello, actualiza el código con el que se muestra a continuación. Observa que el código ahora presenta una nueva variable val, llamada thirdNumber, e imprime el resultado de esta variable nueva con firstNumber. 
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
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
fun add (num1 : Int,num2 : Int) : Int{
    return num1 + num2
}