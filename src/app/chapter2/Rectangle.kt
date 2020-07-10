package app.chapter2

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0), BLUE(0, 0, 255), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.BLUE -> "B"
        Color.RED -> "R"
        Color.ORANGE -> "O"
        Color.VIOLET -> "V"
    }

fun getWarmth(color: Color) = {
    when (color) {
        Color.BLUE, Color.VIOLET -> "Cold"
        Color.ORANGE, Color.RED -> "Warm"
    }
}

fun mix(c1: Color, c2: Color) = {
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.BLUE) -> Color.VIOLET
        else -> throw Exception("Unknown color")
    }
}

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.ORANGE) -> Color.ORANGE
        else -> throw Exception("Unknown color")
    }