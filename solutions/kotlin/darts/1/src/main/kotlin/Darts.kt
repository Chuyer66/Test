object Darts {
    // 使用 Number 类型接收参数（兼容 Int、Double 等数字类型）
    fun score(x: Number, y: Number): Int {
        // 转为 Double 计算距离平方
        val xDouble = x.toDouble()
        val yDouble = y.toDouble()
        val distanceSquared = xDouble * xDouble + yDouble * yDouble
        
        return when {
            distanceSquared <= 1.0 -> 10   // 内圈（半径1）
            distanceSquared <= 25.0 -> 5   // 中圈（半径5）
            distanceSquared <= 100.0 -> 1  // 外圈（半径10）
            else -> 0                      // 脱靶
        }
    }
}