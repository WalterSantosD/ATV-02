fun main() {
    val circulo = Circulo()
//    listaFiguras.add(circulo)

    val quadrado = Quadrado()
//    listaFiguras.add(quadrado)

    val triangulo = Triangulo()
//    listaFiguras.add(triangulo)

    val listaFiguras = mutableListOf<Figura>(triangulo, quadrado, circulo)


    for (i in 0..2) {
        println(listaFiguras[i].calculaArea())

        if (listaFiguras[i] === triangulo) {
            println(triangulo.calcularHipotenusa())
            println("-----------------------------------")
        }
        if (listaFiguras[i] === quadrado) {
            println(quadrado.calcularDiagonal())
            println("-----------------------------------")
        }
        if (listaFiguras[i] === circulo) {
            println(circulo.calcularDiametro())
            println("-----------------------------------")
        }
    }


}










