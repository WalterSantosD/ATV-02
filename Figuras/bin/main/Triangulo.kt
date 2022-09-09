class Triangulo : Figura {
    val nome = "triangulo"
    var hipotenusa: String = "hipotenusa"

    override
    fun calculaArea(): String {
        return "Area do Triangulo "
    }

    override
    fun numeroCatetos(): String {
        return "3 catetos";
    }

    fun calcularHipotenusa():String{
        return "hipotenusa do triangulo"
    }
}