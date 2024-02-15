package shapes

import Shape

class Circle(color: String, isTransparent: Boolean, val radius: Double): Shape(color, isTransparent){
    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}