fun main() {
    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    val valorRetirada = readLine()!!.toFloat()

    //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
    val saldoFinal = saldoAtual + valorDeposito - valorRetirada
  //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    print("Saldo atualizado na conta: $saldoFinal")
}