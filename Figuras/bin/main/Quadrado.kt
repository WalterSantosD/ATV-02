class Quadrado : Figura {
    val nome = "quadrado"
    var diagonal: String = "diagonal";

    override fun calculaArea(): String {
        return "Area do quadrado "
    }

    override fun numeroCatetos(): String {
        return "4 catetos";
    }

    fun calcularDiagonal():String{
        return "diagonal do quadrado"
    }
}