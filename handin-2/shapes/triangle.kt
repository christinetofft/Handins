package shapes

import Shape

class Triangle(color: String, isTransparent: Boolean, val side1: Double, val side2: Double, val side3: Double, val height: Double): Shape(color, isTransparent){
    override fun calculatePerimeter(): Double {
        return side1 + side2 + side3
    }

    override fun calculateArea(): Double {
        return 0.5 * side1 * height
    }
}