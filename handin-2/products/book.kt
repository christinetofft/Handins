package products

import Product

class Book(name: String, price: Int, quantity: Int): Product(name, price, quantity){
    override fun identifyProductCategory() {
        println("I am a book")
    }
}