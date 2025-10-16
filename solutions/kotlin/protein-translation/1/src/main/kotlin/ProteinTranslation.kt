fun translate(rna: String?): List<String> {
    if (rna == null) return emptyList()
    
        val codonTable = mapOf(
        "AUG" to "Methionine",
        "UUU" to "Phenylalanine", "UUC" to "Phenylalanine",
        "UUA" to "Leucine", "UUG" to "Leucine",
        "UCU" to "Serine", "UCC" to "Serine", "UCA" to "Serine", "UCG" to "Serine",
        "UAU" to "Tyrosine", "UAC" to "Tyrosine",
        "UGU" to "Cysteine", "UGC" to "Cysteine",
        "UGG" to "Tryptophan",
        "UAA" to "Stop", "UAG" to "Stop", "UGA" to "Stop"
    )

    val proteins = mutableListOf<String>()
    val len = rna.length

    var i = 0
    var flag = 1
    var codon: String? = null
    while (i < len) {
        if(len - i >= 3){
            codon = rna.substring(i, i + 3) //左闭右开
        }
        else{
            break
        }
        val aminoAcid = codonTable[codon] ?: throw IllegalArgumentException("Invalid codon: $codon")

            if (aminoAcid == "Stop") {
            flag = 0
            break
        }

        proteins.add(aminoAcid)
        i += 3
    }
    if (rna.length % 3 != 0 && flag == 1) throw IllegalArgumentException("RNA length is not a multiple of 3")
    return proteins
}