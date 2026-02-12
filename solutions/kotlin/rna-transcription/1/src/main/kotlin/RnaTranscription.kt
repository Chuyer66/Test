fun transcribeToRna(dna:String): String{
    val dnaToRnaMap = mapOf(
        'G' to 'C',
        'C' to 'G',
        'T' to 'A',
        'A' to 'U'
    )
    return dna.map { nucleotide ->
        dnaToRnaMap[nucleotide] 
    }.joinToString("")
}