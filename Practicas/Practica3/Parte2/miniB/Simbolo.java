
public class Simbolo {

    public enum EnumTipo{ Float, String,  Integer, Double, Boolean }

    public EnumTipo tipo;
    public Object valor;
    public int almacenado;

    public Simbolo(EnumTipo tipo, Object valor,int almacenado){
        this.tipo  = tipo;
        this.valor = valor;
        this.almacenado = almacenado;
    }

    
}
