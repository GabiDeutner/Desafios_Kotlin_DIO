fun main() {
    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    val valorRetirada = readLine()!!.toFloat()

    val saldoFinal = (saldoAtual + valorDeposito) - valorRetirada
    println("Saldo atualizado na conta: %.1f".format(saldoFinal))
}