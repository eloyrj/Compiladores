
public class Simbolo {

    public enum EnumTipo{ Float, String,  Integer, Double, Boolean }

    public EnumTipo tipo;
    public int almacenado;

    public Simbolo(EnumTipo tipo,int almacenado){
        this.tipo  = tipo;
        this.almacenado = almacenado;
    }

    
}
