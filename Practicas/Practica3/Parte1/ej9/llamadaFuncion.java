public class llamadaFuncion {
    // Ser capaz de llamar a una función sin parámetros ni devolución de resultado
    public llamadaFuncion(){

    }

    public void funcion(){
        System.out.println("Se ha llamado a la funcion ");
    }

    public static void main(String[] args) {
        llamadaFuncion f = new llamadaFuncion();
        f.funcion();
    }
    
}
