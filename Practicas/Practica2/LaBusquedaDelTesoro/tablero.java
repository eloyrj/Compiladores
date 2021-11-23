
public class tablero {
    private String nombre;
    private int elementos;
    private String[][] tablero ;

    public tablero(){
        tablero = new String[5][5];
        elementos = 0;
    }

    public String[][] getTablero() {
        return tablero;
    }
    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public void introducirEnTablero(int x , int y, String s){
        tablero[y][x] = s;
        elementos++;
    }
    public void eliminarDeTablero(int x , int y){
        tablero[y][x]=null;
        elementos--;
    }

    public String sacarDeTablero(int x , int y){
        return tablero[y][x];
    }

    public void imprimirTablero(){
        for(int i = 0 ; i< tablero.length;i++){
            for (int j = 0 ; j< tablero[i].length;j++){
                if(tablero[i][j]!=null){
                    System.out.format(" | %16s",tablero[i][j]);
                }else{
                    System.out.format(" | %16s","");
                }

            }
            System.out.format(" |%n");
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getElementos() {
        return elementos;
    }
    public void setElementos(int elementos) {
        this.elementos = elementos;
    }
   
}
