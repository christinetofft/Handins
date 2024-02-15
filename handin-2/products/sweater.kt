package products

import Product

class Sweater(name: String, price: Int, quantity: Int): Product(name, price, quantity){
    override fun identifyProductCategory() {
        println("I am a sweater")
    }
}