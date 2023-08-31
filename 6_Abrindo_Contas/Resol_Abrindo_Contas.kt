import java.util.Scanner

class ContaBancaria(private val numeroConta: Int, private val nomeTitular: String, private val saldo: Double) {
    fun getNumeroConta(): Int {
        return numeroConta
    }

    fun getNomeTitular(): String {
        return nomeTitular
    }

    fun getSaldo(): Double {
        return saldo
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    val numeroConta = scanner.nextInt()
    scanner.nextLine()

    val nomeTitular = scanner.nextLine()

    val saldo = scanner.nextDouble()

    val contaBancaria = ContaBancaria(numeroConta, nomeTitular, saldo)

    println("Informacoes:")
    println("Conta: ${contaBancaria.getNumeroConta()}")
    println("Titular: ${contaBancaria.getNomeTitular()}")
    println("Saldo: R$ ${contaBancaria.getSaldo()}")
}