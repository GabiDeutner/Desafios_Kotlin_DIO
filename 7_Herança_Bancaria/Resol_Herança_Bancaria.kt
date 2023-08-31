import java.text.DecimalFormat
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val nomeTitular = scanner.next()
    val numeroConta = scanner.nextInt()
    val saldo = scanner.nextDouble()
    val taxaJuros = scanner.nextDouble()

    val contaPoupanca = ContaPoupanca(numeroConta, nomeTitular, saldo, taxaJuros)

    println("Conta Poupanca:")
    contaPoupanca.exibirInformacoes()

    scanner.close()
}

open class Bancaria(private val numeroConta: Int, private val nomeTitular: String, private val saldo: Double) {
    protected val decimalFormat = DecimalFormat("#.0")

    open fun exibirInformacoes() {
        println(nomeTitular)
        println(numeroConta)
        println("Saldo: R$ " + decimalFormat.format(saldo))
    }
}

class ContaPoupanca
    (
    numeroConta: Int,
    nomeTitular: String,
    saldo: Double,
    private val taxaJuros: Double,
) : Bancaria(numeroConta, nomeTitular, saldo) {


    override fun exibirInformacoes() {
        super.exibirInformacoes()
        // TODO: Complementar as informações com a taxa de juros.
        println("Taxa de juros: $taxaJuros%")

    }
}