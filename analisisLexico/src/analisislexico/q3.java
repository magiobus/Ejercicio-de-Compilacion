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
public class q3 {
    public static void analisis(char cadena[],int indice){
        if(indice < cadena.length){ // Revisa si no esta en el ultimo caracter 
            if(MapaDeCaracteres.isDigit(cadena[indice])){
                System.out.println("q3: indice =" + indice );
                q3.analisis(cadena, indice+1);
            }
            else
                if(cadena[indice] == '.' ){
                    indice = indice +1 ;
                    q4.analisis(cadena, indice);
                }
                if(MapaDeCaracteres.isChar(cadena[indice])){
                    qe.analisis(cadena, indice);
                }
                if(cadena[indice] == ' '){
                    q0.analisis(cadena, indice);
                }
                
            }
        else { // Si esta en el ultimo caracter, termina el programa 
            System.out.println("fin programa");
            System.exit(0);
        }

    }
    
}
