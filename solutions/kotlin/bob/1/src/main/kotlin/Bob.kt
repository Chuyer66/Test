object Bob {
    fun hey(input: String): String {
        val trimmedInput = input.trim()
        
        return when {
            // 1. 处理沉默（空白输入）
            trimmedInput.isEmpty() -> "Fine. Be that way!"
            // 2. 处理大喊的问题（同时满足大喊和问句）
            isShouting(trimmedInput) && trimmedInput.endsWith('?') -> "Calm down, I know what I'm doing!"
            // 3. 处理单纯大喊（非问句）
            isShouting(trimmedInput) -> "Whoa, chill out!"
            // 4. 处理单纯问句（非大喊）
            trimmedInput.endsWith('?') -> "Sure."
            // 5. 其他情况
            else -> "Whatever."
        }
    }
    
    // 判断是否为大喊：包含字母且所有字母都是大写
    private fun isShouting(input: String): Boolean {
        val letters = input.filter { it.isLetter() }
        return letters.isNotEmpty() && letters.all { it.isUpperCase() }
    }
}