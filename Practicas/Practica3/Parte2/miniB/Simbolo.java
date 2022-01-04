
public class Simbolo {

    public enum EnumTipo{ Float, String,  Integer, Double, Boolean }

    public EnumTipo tipo;
    public Object valor;

    public Simbolo(EnumTipo tipo, Object valor){
        this.tipo  = tipo;
        this.valor = valor;
    }

    
}
