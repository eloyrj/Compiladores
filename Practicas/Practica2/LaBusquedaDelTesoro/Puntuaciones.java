import java.util.HashMap;

public class Puntuaciones {
    private int puntos;
    private HashMap<String,Integer>  puntuajes;

    public Puntuaciones(){
        puntos = 0;
        puntuajes = new HashMap<>();
    }

    public void addPuntuaje(String obj, int puntos){
        puntuajes.put(obj, puntos);
    }

    public int getPuntuajes(String obj) {
        return puntuajes.get(obj);
    }
    
    
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
