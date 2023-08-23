import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    val df = DecimalFormat("#.00")
    
    val valorInicial = scanner.nextDouble()

    val taxaJuros = scanner.nextDouble()
  
    val periodo = scanner.nextInt()

    var valorFinal = valorInicial


    //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
    
    for (i in 1..periodo) {
        valorFinal *= (1 + taxaJuros)
    }
    
    println("Valor final do investimento: R$ ${df.format(valorFinal)}")

    scanner.close()
}