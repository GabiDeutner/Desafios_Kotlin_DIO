fun main() {
    val ativos = mutableListOf<String>()

    // Entrada da quantidade de ativos
    val quantidadeAtivos = readLine()!!.toInt()

    // Entrada dos códigos dos ativos
    for (i in 1..quantidadeAtivos) {
        val codigoAtivo = readLine()!!
        ativos.add(codigoAtivo)
    }

     //TODO: Ordenar os ativos em ordem alfabética.
     
    val ativosOrdenados = ativos.sorted()

    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    
    for (ativo in ativosOrdenados) {
        println(ativo)
    }
    
}