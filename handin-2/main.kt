import products.Book
import products.Shoe
import products.Sweater
import shapes.Circle
import shapes.Rectangle
import shapes.Triangle
import computers.Laptop
import computers.SmartPhone
import cars.Truck

fun main(){

    //1.
    val employee1: Employee = Employee("Peter", "Koft", 23.400)
    val employee2: Employee = Employee("Anja", "Simonsen", 78.700)
    println("${employee1.firstname}'s monthly salary: ${employee1.checkSalary}")
    println("${employee2.firstname}'s monthly salary: ${employee2.checkSalary}")
    println("${employee1.firstname}'s yearly salary: ${employee1.yearlySalary()}")
    println("${employee2.firstname}'s yearly salary: ${employee2.yearlySalary()}")

    println("${employee1.firstname}'s yearly salary with the raise: ${employee1.addRaise()}")
    println("${employee2.firstname}'s yearly salary with the raise: ${employee2.addRaise()}")

    //2.
    val laptop: Laptop = Laptop("Macbook Pro", "Apple", 14900, 14)
    val smartphone: SmartPhone = SmartPhone("Smartphone", "Samsung", 5900, "Blue")

    println("The device is a: ${laptop.device}")
    laptop.destroy()
    smartphone.turnOn()
    println("The smartphone's color is: ${smartphone.color}")


    //3.
    val book: Book = Book("Magnolia Parks", 180, 3000)
    val sweater: Sweater = Sweater("Wool Sweater", 650, 150)
    val shoe: Shoe = Shoe("Adidas 101", 980, 850)

    val listOfProducts: List<Product> = listOf(book, sweater, shoe)
    for (product: Product in listOfProducts) {
        product.identifyProductCategory()
    }

    //4.
    val rectangle: Rectangle = Rectangle("Purple", false, 2.0, 4.0)
    println("Rectangle perimeter: ${rectangle.calculatePerimeter()}")
    println("Rectangle area: ${rectangle.calculateArea()}")

    val triangle: Triangle = Triangle("Blue", true, 2.0, 3.0, 2.0, 4.0)
    println("Triangle perimeter: ${triangle.calculatePerimeter()}")
    println("Triangle area: ${triangle.calculateArea()}")

    val circle: Circle = Circle("Pink", false, 6.0)
    println("Circle perimeter: ${circle.calculatePerimeter()}")
    println("Circle area: ${circle.calculateArea()}")

    //Optional
    val truck1: Truck = Truck(240, 2500000, "black", 2500)
    println("The price of the truck with the sale: ${truck1.getSalePrice()}")

}


//1. Create a class called Employee that includes three pieces of information as instance variables
//Your class should have a constructor that initializes the three instance variables.
//If the monthly salary is not positive, set it to 0.0.

class Employee(val firstname:String, val lastname:String, var monthlySalary: Double){
    var checkSalary:Double = monthlySalary
        get(){
            if (monthlySalary < 0.0){
                field = 0.0
            }
            return field
        }
        set(value) {
            if (value > 0.0){
                field = value
            } else {
                field = 0.0
            }
            field = 0.0
        }

    //Create two Employee objects and display each object’s yearly salary.
    fun yearlySalary(): Double {
        return monthlySalary * 12
    }

    //Then give each Employee a 10% raise and display each Employee’s yearly salary again.
    fun addRaise(): Double {
        return (monthlySalary * 1.10) * 12
    }
}


//2. Create a new class called Computer.
// Before you add any more code, know that you will need to add two additional classes: Laptop and SmartPhone

open class Computer(val device: String, open val brand: String, price: Int) {
    open fun turnOn(){
        println("$device has been turned on")
    }
    open fun turnOff(){
        println("$device has been turned off")
    }
}


//3. Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory.
//Subclass it to create specific product types like Shoe, T-shirt, and Book. Override the function such that:
//The shoe outputs "I am a shoe" .
//The T-shirt outputs "I am a T-shirt"
//The book outputs "I am a book"

open class Product(val name: String, var price: Int, var quantity: Int) {
    open fun identifyProductCategory(){
        println("I am a product")
    }
}

//4. Create 3 classes Circle, Rectangle & Triangle with a parent class: Shape.

open class Shape(val color: String, isTransparent: Boolean) {
    open fun calculatePerimeter(): Double {
        return 2.5 + 2.5 //Har bare skrevet tilfældige tal her.
    }
    open fun calculateArea(): Double {
        return 2.5 + 2.5
    }
}

//Auto-shop - Optional

open class Car(val speed: Int, val regularPrice: Int, val color: String){

    var salesPrice = regularPrice

    open fun getSalePrice() : Int {
        return regularPrice
    }
}
