/* Great job! You displayed the message. However, in some cases, you discover that you can't determine the user's operating system. In such cases, you need to specify the operating system name as Unknown OS. You can further optimize the code so that you don't need to pass the Unknown OS argument each time that the function is called.

Can you find a way to optimize the code with this information so that it prints this output?

There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There's a new sign-in request on Windows for your Google Account user_two@gmail.com. 

There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com. 
To print the above message, replace the main() function implementation with this one:

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

*/
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId)+"\n")

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId)+"\n")

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId)+"\n")
}
fun displayAlertMessage (operationSystem : String = "Unknown OS", emailId : String) : String{
 return "There's a new sign-in request on $operationSystem for your Google Account $emailId"   
}