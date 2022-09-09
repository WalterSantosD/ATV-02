open class Circulo: Figura {
    val nome = "circulo"
    var pi: Double = 3.14;

    override fun calculaArea(): String {
        return "Area do circulo "
    }

    override
    fun numeroCatetos():String{
        return "1 catetos";
    }

    fun calcularDiametro():String{
        return "diametro do circulo"
    }
}