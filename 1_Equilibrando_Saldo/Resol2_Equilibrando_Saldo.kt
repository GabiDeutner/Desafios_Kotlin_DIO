fun main() {
    // Entrada de dados com tratamento de erros
    val saldoAtual = readLine()?.toFloatOrNull()
    val valorDeposito = readLine()?.toFloatOrNull()
    val valorRetirada = readLine()?.toFloatOrNull()

    if (saldoAtual == null || valorDeposito == null || valorRetirada == null) {
        println("Entrada inválida. Certifique-se de inserir números válidos.")
        return
    }

    // Calcular o saldo final
    val saldoFinal = saldoAtual + valorDeposito - valorRetirada

    // Imprimir o saldo final com uma casa decimal
    println("Saldo atualizado na conta: %.1f".format(saldoFinal))
}