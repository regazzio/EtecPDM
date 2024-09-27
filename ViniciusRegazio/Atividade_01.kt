fun main() {
    val nomeCompleto: String = "Vinicius Regazio Farias"

    val texto: String? = null

    val numeroCalculado: Byte = 43

    val pibBrasil: Long = 10_900_000_000_000
    val populacaoBrasil: Int = 212_600_000

    val pibPerCapita = pibBrasil / populacaoBrasil
    println("O PIB per capita é: R$ $pibPerCapita")
}