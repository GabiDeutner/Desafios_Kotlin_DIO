import java.util.Scanner
import java.text.DecimalFormat

fun main() {
  val scanner = Scanner(System.`in`)
  val valor = scanner.nextDouble()
  val df = DecimalFormat("#.00")
  val saldo = df.format(valor)

  if (valor > 0) {
    //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
    println("Deposito realizado com sucesso!")
    print("Saldo atual: R$ $saldo")
  } else if (valor == 0.0) {
    //TODO: Imprimir a mensagem de valor inválido.
    print("Encerrando o programa...")
  } else {
    //TODO: Imprimir a mensagem de encerrar o programa.
    print("Valor invalido! Digite um valor maior que zero.")
  }
}