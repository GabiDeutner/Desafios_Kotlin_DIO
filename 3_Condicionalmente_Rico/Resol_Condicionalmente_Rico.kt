fun main() {
    // Entrada de dados
    val saldoTotal = readLine()?.toIntOrNull() ?: 0
    val valorSaque = readLine()?.toIntOrNull() ?: 0

    // Verificar se as entradas são válidas
    if (saldoTotal <= 0 || valorSaque <= 0) {
        println("Entrada inválida. Certifique-se de inserir números inteiros positivos.")
    } else {
        // Processar a transação
        val saldoDisponivel = saldoTotal - valorSaque

        // Imprimir o resultado com base nas condições
        when {
            saldoDisponivel >= 0 -> {
                println("Saque realizado com sucesso. Novo saldo: $saldoDisponivel")
            }
            else -> {
                println("Saldo insuficiente. Saque nao realizado!")
            }
        }
    }
}