interface Figura{

    fun calculaArea():String;
    fun numeroCatetos():String;

    fun Verifica(figura: Figura): String{
        return figura.calculaArea();
    }
}