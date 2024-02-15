package shapes

import Shape

class Rectangle(color: String, isTransparent: Boolean, val height: Double, val width: Double): Shape(color, isTransparent){
    override fun calculatePerimeter(): Double {
        return 2 * (height + width)
    }
    override fun calculateArea(): Double {
        return height * width
    }
}