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
public class q6 {
    public static void analisis(char cadena[],int indice){
        if(indice <= cadena.length-1){
            System.out.println("q6");
            if(MapaDeCaracteres.isDigit(cadena[indice])){
            indice = indice + 1;
            q8.analisis(cadena, indice);
            }
            if(cadena[indice]=='+' || cadena[indice]=='-'){
                indice= indice+1;
                q7.analisis(cadena, indice);
            }
            
            else{
            qe.analisis(cadena, indice);
            }
        }
         else { // Si esta en el ultimo caracter, termina el programa 
                System.out.println("fin programa");
                System.exit(0);
}
    }
}
