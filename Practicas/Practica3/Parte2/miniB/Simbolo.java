
public class Simbolo {

    public enum EnumTipo{ Float, String,  Integer, Double, Boolean, Funcion }

    public EnumTipo tipo;
    public Object valor;
    public int almacenado;
    public EnumTipo tipoLLamadaFun;
    public EnumTipo tipoReturnFun;

    public Simbolo(EnumTipo tipo,int almacenado){
        this.tipo  = tipo;
        this.almacenado = almacenado;
    }

    public Simbolo(EnumTipo tipo,Object valor,int almacenado){
        this.tipo  = tipo;
        this.valor = valor;
        this.almacenado = almacenado;
    }

    public Simbolo(EnumTipo tipo,Object valor){
        this.tipo  = tipo;
        this.valor = valor;
    }

    public EnumTipo getTipoLLamadaFun() {
        return tipoLLamadaFun;
    }

    public void setTipoLLamadaFun(EnumTipo tipoLLamadaFun) {
        this.tipoLLamadaFun = tipoLLamadaFun;
    }

    public EnumTipo getTipoReturnFun() {
        return tipoReturnFun;
    }

    public void setTipoReturnFun(EnumTipo tipoReturnFun) {
        this.tipoReturnFun = tipoReturnFun;
    }

    
    
}
