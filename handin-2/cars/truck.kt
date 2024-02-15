package cars

import Car

class Truck(speed: Int, regularPrice: Int, color: String, val weight: Int): Car(speed, regularPrice, color){
    override fun getSalePrice(): Int {
        if (weight > 2000) {
            return (regularPrice * 0.9).toInt()
        }
        return (regularPrice * 0.8).toInt()
    }
}