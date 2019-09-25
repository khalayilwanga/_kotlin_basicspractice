/* Challenge: Functional Programming for Data Analysis
Challenge: Apply Functional Programming for Simple Data Analysis
We decided to gather data on the age of our users.

In this challenge, you'll be presented with this partly faulty data of user ages which is based on four input files:

// Some faulty data with ages of our users
val data = mapOf(
    "users1.csv" to listOf(32, 45, 17, -1, 34),
    "users2.csv" to listOf(19, -1, 67, 22),
    "users3.csv" to listOf(),
    "users4.csv" to listOf(56, 32, 18, 44)
)


Apply the functions you learned about as well as other functions from Kotlin's standard library to solve the following data analysis tasks:

Find the average age of users (use only valid ages for the calculation!)
Extract the names of input files that contain faulty data
Count the total number of faulty entries across all input files
@author Peter Sommerhoff

My solution found below:
*/
fun main(args: Array<String>) {
    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )
    // finding the average
    val flatdatavalues = data.flatMap { it.value }.filter { it > 0 }
    print("$flatdatavalues \n")
    val average = flatdatavalues.average()
    println("the average is : $average")

    //extracting names of input files with faulty data
    val faultydatakeys = data.filter{it.value.any{it<0}}.map{it.key}
    println(faultydatakeys)

    //counting faulty entries
    val sumoffaultydatavalues = data.flatMap { it.value }.filter { it < 0 }.count()
    println(sumoffaultydatavalues)
}



