import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        if (number !in 1..64) {
            throw IllegalArgumentException("Square number must be between 1 and 64")
        }
        return BigInteger.valueOf(2).pow(number - 1)
    }

    fun getTotalGrainCount(): BigInteger {
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE)
    }
}

fun main() {
    try {
        println(Board.getGrainCountForSquare(0))  // 这里会抛异常
    } catch (e: IllegalArgumentException) {
        println("Caught expected exception: ${e.message}")
    }
}
