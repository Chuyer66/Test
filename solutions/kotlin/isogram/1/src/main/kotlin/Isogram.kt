object Isogram {
    
    fun isIsogram(s: String): Boolean {
    val lower = s.lowercase()  // 转成小写，忽略大小写
    val seen = mutableSetOf<Char>()
    for (char in lower) {
        if (char.isLetter()) {  // 只检查字母，忽略空格和连字符
            if (char in seen) {
                return false // 重复字母，返回 false
            }
            seen.add(char)
        }
    }
    return true  // 没有重复字母，是等位字
}
}


