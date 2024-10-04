fun main() {

    //converterAnos(2)
    //println(caracteres("Kotlin"))
    //calcularCubo(2)
    trocarLetras()

    // Exercício 4
    println("5 milhas em km: ${converterMilhasParaKm(5)}")
    
}

// 1. Função que converte anos em meses, dias, horas, minutos e segundos
fun converterAnos(anos: Int) {
    val meses = anos * 12
    val dias = anos * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60

    println("$anos anos equivalem a:")
    println("$meses meses")
    println("$dias dias")
    println("$horas horas")
    println("$minutos minutos")
    println("$segundos segundos")
}

// 2. Função que conta a quantidade de caracteres de uma string
fun contarCaracteres(str: String): Int = str.length

// 3. Função que calcula o cubo de um número
fun calcularCubo(numero: Int){
  PrintIn("O cubo de $numero é ${numero = numero * numero}")
}

// 4. Função que converte milhas em km
fun converterMilhasParaKm(milhas: Double): Double = milhas * 1.6

// 5. Função que troca "a" ou "A" por "x" e imprime a string fin
fun trocarLetras(texto: String) {
    println(texto.lowescase().replace("a", "x"))
}
// 6. Sobre as funções criadas nos exercícios 2, 3 e 4, é possível transfomá-las em fuções de uma única linha? Se sim, trasforme-as.
fun caracteres2 (texto: String) = "$texto tem ${texto.length} caracateres"
