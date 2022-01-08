import java.util.HashMap;

public class TablaSimbolos {
    
    public HashMap<String,Simbolo> tabla;
    public TablaSimbolos anterior;                  

    public TablaSimbolos(TablaSimbolos anterior){
        this.anterior = anterior;
        this.tabla = new HashMap<>();
    }

    public void insertar(String n, Simbolo s){
        if(tabla.containsKey(n)){
            System.out.println("La variable ya existe");
            return;
        }
        tabla.put(n,s);
    }
    
    public Simbolo buscar(String n){
        for(TablaSimbolos t = this; t!=null ; t = t.anterior){
            if(t.tabla.containsKey(n)){
                Simbolo s = t.tabla.get(n);
                return s;
            }
        }
        return null;
    }

    public void actualizarV(String n,Object valor){
        Simbolo s = buscar(n);
        s.valor=valor;
        tabla.remove(n);
        tabla.put(n, s);
    }


}
