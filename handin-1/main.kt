fun main(){

    //1.
    eligibleAge()

    //2.
    getNumber()

    //3.
    calculateAverage(numbers)

    //4.
    validCpr(1712015086)

    //5.
    fizzBuzzPrinter()

    //6.
    nameAbbreviation()

    //7.
    gradeConverter(83)

    //8.
    val strings = listOf("Taylor Swift", "Hund", "Nattøj", "Hindbær", "Espresso Martini")
    filterWordsByLength(strings, 4)
}
//1. A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote. Let the user input their age.
fun eligibleAge(){
    print("Please enter your age here: ")
    val inputtedAge = readLine();
    if (inputtedAge != null) {
        val AgeAsFloat = inputtedAge.toFloat()
        if (AgeAsFloat >= 18) {
            println("You are eligible to vote.")
        } else {
            println("You are not eligible to vote.")
        }
    } else {
        println("Age not found.")
    }
}

//2. Define two functions to print the maximum and the minimum number respectively among three numbers
fun getNumber() {
    val max = listOf(17, 8, 12)
    fun getMax(numbers: List<Int>): Int {
        val sortedListMax = numbers.sortedDescending()
        return sortedListMax[0]
    }
    val maxNumber = getMax(max)
    println("The maximum number of the list is: $maxNumber")

    val min = listOf(17, -4, 1)
    fun getMin(numbers: List<Int>): Int {
        val sortedListMin = numbers.sortedDescending()
        return sortedListMin[2]
    }
    val minNumber = getMin(min)
    println("The minimum number of the list is: $minNumber")
}

//3. Write a Kotlin function named calculateAverage that takes in a list of numbers and
// returns their average.
val numbers = listOf(1, 4, 8, 19, 23)
fun calculateAverage(numbers: List<Int>) {
    val sum = numbers.sum()
    val average = sum / numbers.size
    println("The average of the numbers is: $average")
}

//4. Write a method that returns if a user has input a valid CPR number.
fun validCpr(cpr: Int) {
    println("Please enter your CPR number here: ")
    val cpr = readLine()?: ""

    if (cpr.length != 10) {
        println("Invalid CPR length.")
    }

    val day = cpr.substring(0,2).toIntOrNull()
    val month = cpr.substring(2,4).toIntOrNull()

    if (day == null || month == null || day > 31 || month >12) {
        println("Invalid CPR number")
    }
    println("CPR number is valid")
}

//5. Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

fun fizzBuzzPrinter(){
    for (i in 1..100){
        if (i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz")
        } else if (i % 5 == 0){
            println("Buzz")
        } else if (i % 3 == 0){
            println("Fizz")
        } else {
            println(i)
        }
    }
}

//6. Write a program that takes your full name as input and displays the abbreviations
// of the first and middle names except the last name which is displayed as it is.

fun nameAbbreviation(){
    print("Please enter your full name here: ")
    val inputtedName = readLine()
    val names = inputtedName?.split(" ")
    if (names != null) {
        if (names.size >= 2){
            val firstName = names.first().first().uppercaseChar() + ". "
            //Jeg ved godt, at denne funktion kun fungerer med 2 mellemnavne, men kunne simpelthen ikke regne ud hvordan den blev løst ellers.
            val middleName1 = names[1].first().uppercaseChar() + ". "
            val middleName2 = names[2].first().uppercaseChar() + ". "
            val lastName = names.last()
            println(firstName + middleName1 + middleName2 + lastName)
        }
    }
}

/*7. Write a program that takes a numerical grade (0-100) as input and prints out the corresponding
 american letter grade. Implement a function calculateGrade that takes an integer parameter
 representing the grade and returns a string representing the letter grade according to the following scale:
90-100: "A"
80-89: "B"
70-79: "C"
60-69: "D"
Below 60: "F"
 */
fun gradeConverter(grade:Int) {
    when (grade) {
        in 0..60 -> println("F")
        in 60..69 -> println("D")
        in 70..79 -> println("C")
        in 80..89 -> println("B")
        in 90..100 -> println("A")
    }
}

//8. Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum length,
// and returns a list containing only the words that have a length greater than or equal to the specified minimum length.

fun filterWordsByLength(string: List<String>, min: Int){
    val strings = listOf("Taylor Swift", "Hund", "Nattøj", "Hindbær", "Espresso Martini")
    val filteredList = strings.filter { it.length >= min }

    println("Here are the words from the list with length greater than ${min}:")
    filteredList.forEach {println(it)}
}