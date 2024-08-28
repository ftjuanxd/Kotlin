/*This program displays the weather for different cities. It includes the city name, the high and low temperature for the day, and the chance of rain.


fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()
    
    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()
    
    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}
There are many similarities in the code that prints the weather for each city. For example, there are phrases that are repeated multiple times, such as "City:" and "Low temperature:". Similar, repeated code creates the risk of errors in your program. For one of the cities, you may have a typo or you may forget one of the weather details.

Can you create a function that prints the weather details for a single city to reduce the repetition in the main() function and then do the same for the remaining cities?
Can you update the main() function to call the function that you created for each city and pass in the appropriate weather details as arguments? */
fun main() {
    var city = "Ankara"
    var lowTemperature = 27
    var highTemperature = 31
    var chanceRain = 82
    print(weather(city,lowTemperature,highTemperature,chanceRain))

    city =  "Tokyo"
    lowTemperature = 32
    highTemperature = 36
    chanceRain = 10
    print(weather(city,lowTemperature,highTemperature,chanceRain))
    
    city =  "Cape Town"
    lowTemperature =  59
    highTemperature = 64
    chanceRain = 2
    print(weather(city,lowTemperature,highTemperature,chanceRain))
    
    city = "Guatemala City"
    lowTemperature = 50
    highTemperature = 55
    chanceRain = 7
    print(weather(city,lowTemperature,highTemperature,chanceRain))
}
fun weather (city : String, lowTemperature : Int, highTemperature : Int, chanceRain : Int){
    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceRain%")
    println()
}