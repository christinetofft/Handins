package computers

import Computer

class SmartPhone(device: String, brand: String, price: Int, val color: String): Computer(device, brand, price){
    override fun turnOn() {
        println("Smartphone has been turned on")
    }

    override fun turnOff() {
        println("Smartphone has been turned off")
    }
    fun upgrade(){
        println("Smartphone has been upgraded")
    }
}