import java.util.Scanner

abstract class Cofre(protected val tipo: String, protected val metodoAbertura: String) {

    fun imprimirInformacoes() {
        println("Tipo: $tipo")
        println("Metodo de abertura: $metodoAbertura")
    }
}

class CofreDigital(private val senha: Int) : Cofre("Cofre Digital", "Senha") {

    fun validarSenha(confirmacaoSenha: Int): Boolean {
        return confirmacaoSenha == senha
    }
}

class CofreFisico : Cofre("Cofre Fisico", "Chave")

fun main() {
    val scanner = Scanner(System.`in`)

    val tipoCofre = scanner.nextLine()

    if (tipoCofre == "fisico") {
        val cofreFisico = CofreFisico()
        cofreFisico.imprimirInformacoes()
    } else if (tipoCofre == "digital") {
        val senha = scanner.nextInt()
        val cofreDigital = CofreDigital(senha)

        val senha2 = scanner.nextInt()
        if (cofreDigital.validarSenha(senha2)) {
            cofreDigital.imprimirInformacoes()
            println("Cofre aberto!")
        } else {
            cofreDigital.imprimirInformacoes()
            println("Senha incorreta!")
        }


    }

}