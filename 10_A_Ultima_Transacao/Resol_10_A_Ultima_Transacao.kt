import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val entrada = scanner.nextLine()
    val partes = entrada.split(",".toRegex()).toTypedArray()

    // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.
    val transacao = Transacao(partes[0],
        partes[1],
        partes[2],
        partes[3].toDouble()
    )

    transacao.imprimir()
}

class Transacao(
    private val data: String,
    private val hora: String,
    private val descricao: String,
    private val valor: Double
) {

    fun imprimir() {
        println(descricao)
        println(data)
        println(hora)
        System.out.printf("%.2f", valor)
    }
}