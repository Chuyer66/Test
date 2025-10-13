object ETL {
    fun transform(old: Map<Int, List<Char>>): Map<Char, Int> {
        return old.flatMap { (score, letters) ->
            letters.map { letter ->
                letter.lowercaseChar() to score
            }
        }.toMap()
    }
}
