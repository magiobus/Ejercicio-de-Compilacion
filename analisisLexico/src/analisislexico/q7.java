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
public class q7 {
    public static void analisis(char cadena[],int indice){
        if(indice < cadena.length-1){
            System.out.println("q7");
            if(MapaDeCaracteres.isDigit(cadena[indice])){
                q8.analisis(cadena, indice+1);
            }
            else{
                qe.analisis(cadena, indice);
            }
        }
        else { // Si esta en el ultimo caracter
           try{
               if(MapaDeCaracteres.isDigit(cadena[indice])){
                   q8.analisis(cadena, indice+1);
               }
           }
           catch(Exception ex){
               qe.analisis(cadena, indice);
           }
        }
    }    
}
