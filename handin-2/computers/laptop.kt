package computers

import Computer

class Laptop(device: String, brand: String, price: Int, val size: Int): Computer(device, brand, price){
    fun destroy(){
        println("BEBFKAHDdufchsai>><<!ZZzzzzzzzzzzz")
        println("Laptop has been destroyed")
    }
}