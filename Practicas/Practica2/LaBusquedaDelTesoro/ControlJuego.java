import java.util.Scanner;

public class ControlJuego {
    private tablero t;
    private Puntuaciones p;
    
    public ControlJuego(){
        t = new tablero();
        p = new Puntuaciones();
    }

    public Puntuaciones getP() {
        return p;
    }
    public tablero getT() {
        return t;
    }

    public void setP(Puntuaciones p) {
        this.p = p;
    }

    public void setT(tablero t) {
        this.t = t;
    }

    public void inicioJuego(){
        boolean fin = false;
        System.out.println("Vas a Jugar en el mapa: "+ t.getNombre());
        Scanner sc = new Scanner(System.in);
        while(!fin){
            System.out.println("Introduce las cordenadas separadas por un espacio: ");
            String in = sc.nextLine();
            String[] entrada = in.toString().split(" ");
            int x =Integer.parseInt(entrada[0])-1;
            int y =Integer.parseInt(entrada[1])-1;

            if(t.sacarDeTablero(x, y)!= null){
                p.setPuntos(p.getPuntos()+p.getPuntuajes(t.sacarDeTablero(x, y)));
                
                System.out.println("Has encontrado " + t.sacarDeTablero(x, y) + " has ganado " + p.getPuntuajes( t.sacarDeTablero(x, y) ));

                t.eliminarDeTablero(x, y);
            }else{
                System.out.println("No has encontrado nada en la casilla "+x+","+y);
            }
            System.out.println("Puntos: "+ p.getPuntos());

            t.imprimirTablero();

            if(t.getElementos()==0){
                fin = true;
            }
            
        }
    }
}