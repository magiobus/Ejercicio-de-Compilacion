/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

import analisislexico.MapaDeCaracteres;

/**
 *
 * @author Gama-Sennin
 */
public class q8 {
    public static void analisis(char cadena[],int indice){
        if(indice <= cadena.length-1){
            System.out.println("q8");
            if(MapaDeCaracteres.isDigit(cadena[indice])){
            indice= indice + 1;
            q8.analisis(cadena, indice);
            }
            else{
            indice= indice+1;
            q9.analisis(cadena, indice);
            }
            
        }
    else { // Si esta en el ultimo caracter, termina el programa 
                System.out.println("fin programa");
                System.exit(0);
}
    }
}
