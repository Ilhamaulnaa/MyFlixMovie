package id.aej.myflix.design_system.utils

import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sin

object MathUtils {
    fun lerp(
        start: Float,
        stop: Float,
        fraction: Float,
    ) = start + (stop - start) * fraction.coerceIn(0f, 1f)

    fun calculateRotatedHeight(originalWidth: Float, originalHeight: Float, angleDefress: Float): Float {
        val angleRadians = angleDefress * (PI / 180).toFloat()
        return (originalWidth * abs(sin(angleRadians))) + (originalHeight * abs(cos(angleRadians)))
    }

}