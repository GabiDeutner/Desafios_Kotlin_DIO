fun main() {
  // Entrada de dados
  val saldoTotal = readLine() !!.toInt()
  val valorSaque = readLine() !!.toInt()

  //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
  if (saldoTotal >= valorSaque){
    val saldoDisponivel = saldoTotal - valorSaque
    print("Saque realizado com sucesso. Novo saldo: $saldoDisponivel")
  } else {
    print("Saldo insuficiente. Saque nao realizado!")
  }
}