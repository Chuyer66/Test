class Dna(dna: String) {

    private val validNucleotides = setOf('A', 'C', 'G', 'T')
    private val counts: Map<Char, Int>

    init {
        // 校验输入是否只包含有效碱基字符
        require(dna.all { it in validNucleotides }) {
            "DNA序列包含无效字符"
        }

        // 统计每个碱基出现的次数
        counts = validNucleotides.associateWith { nucleotide ->
            dna.count { it == nucleotide }
        }
    }

    val nucleotideCounts: Map<Char, Int>
        get() = counts
}

