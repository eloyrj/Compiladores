/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pecl1compiladores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author corte
 */
public class Pecl1Compiladores {

    HashMap<String, Integer>[] matriz;
    int[] estadosFinales = {1, 3, 6, 7, 8};

    public void cargaMatriz() {
        HashMap<String, Integer> estado0 = new HashMap<>();
        HashMap<String, Integer> estado1 = new HashMap<>();
        HashMap<String, Integer> estado2 = new HashMap<>();
        HashMap<String, Integer> estado3 = new HashMap<>();
        HashMap<String, Integer> estado4 = new HashMap<>();
        HashMap<String, Integer> estado5 = new HashMap<>();
        HashMap<String, Integer> estado6 = new HashMap<>();
        HashMap<String, Integer> estado7 = new HashMap<>();
        HashMap<String, Integer> estado8 = new HashMap<>();

        estado0.put("a", 2);
        estado0.put("b", 1);
        
        estado1.put("b", 4);
        estado1.put("c", 3);
        
        estado2.put("c", 5);
        
        estado3.put("d", 7);
        estado3.put("e", 6);
        
        estado4.put("b", 8);
        
        estado5.put("b", 8);
        
        estado6.put("d", 7);
        estado6.put("e", 6);
        
        estado7.put("d", 7);
        estado7.put("e", 6);
        
        estado8.put("b", 4);
        

        matriz = new HashMap[]{estado0, estado1, estado2, estado3, estado4, estado5, estado6, estado7, estado8};

    }

    public int controlEstados(String s, int estado) {
        int resultado;
        if (matriz[estado].get(s) != null) {
            resultado = matriz[estado].get(s);
        } else {
            resultado = 4000; // 4000 es mi codigo de error 
        }
        return resultado;
    }

    public boolean controlAutomata(String cadena) {
        int estado = 0;
        boolean valido = false;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            String a = String.valueOf(caracter);
            estado = controlEstados(a, estado);
            if (estado == 4000) {
                break;
            }

        }
        for (int i = 0; i < estadosFinales.length; i++) {
            if (estadosFinales[i] == estado) {
                valido = true;
            }
        }

        return valido;
    }

    
    public ArrayList<String> generarCadena(int numero, int maximo) {
        ArrayList<ArrayList<String>> caracteres = new ArrayList<>();
        ArrayList<String> cadenas = new ArrayList<>();

        
        for (int i = 0; i < matriz.length; i++) {
            ArrayList<String> posiblesEstado = new ArrayList<>();
            caracteres.add(posiblesEstado);
            for (Map.Entry entry : matriz[i].entrySet()) {
                caracteres.get(i).add(entry.getKey().toString());
            }
        }
        int contador = 0;
        
        while (cadenas.size() < numero) {
            int nLetras = (int) (Math.random() * maximo + 1);
            int estado = 0;
            String cadena = "";
            for (int i = 0; i < nLetras; i++) {
                String letra = "";
                if (caracteres.get(estado).size() > 1) {
                    int letras = (int) (Math.random() * caracteres.get(estado).size());
                    letra = caracteres.get(estado).get(letras);
                } else {
                    letra = caracteres.get(estado).get(0);
                }
                cadena += letra;
                estado = controlEstados(letra, estado);
            }
            if (controlAutomata(cadena)) {
                if (!cadenas.isEmpty()) {
                    boolean repetido = false;
                    for (int i = 0; i < cadenas.size(); i++) {
                        if (cadenas.get(i).equals(cadena)) {
                            repetido = true;
                        }

                    }
                    if (!repetido) {
                        cadenas.add(cadena);
                        
                        contador = 0;
                    } else {
                        contador++;
                    }
                } else {
                    cadenas.add(cadena);
                    
                }
            }
            if (contador == 100000) {
                System.out.println("No hay mas expresiones con esta longitud");
                break;

            }

        }
        Collections.sort(cadenas);
        return cadenas;

    }
    
    public void imprimir(boolean r,String cadena){
        if (r) {
            System.out.println("La cadena "+cadena+" es valida");
        } else {
            System.out.println("La cadena "+cadena+" no es valida");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pecl1Compiladores p = new Pecl1Compiladores();

        p.cargaMatriz();
        p.imprimir(p.controlAutomata("bcdedededdde"),"bcdedededdde");
        p.imprimir(p.controlAutomata("acacacbbbb"),"acacacbbbb");
        
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas = p.generarCadena(300, 15);
        for(int i = 0 ; i < cadenas.size() ; i++){
            System.out.println((i+1)+": "+cadenas.get(i));
        }
    }

}
