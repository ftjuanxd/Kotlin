/* This program displays the total party size. There are adults and kids at the party. The numberOfAdults variable holds the number of adults at the party and the numberOfKids variable holds the number of kids.
Can you determine the output of this program before you run the code 
fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
*/
//Output will be: "The total party size is 2030"
/*Can you find the issue in the code and fix it so that it prints this output?
The total party size is: 50*/
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}