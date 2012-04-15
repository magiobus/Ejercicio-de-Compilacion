/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

/**
 *
 * @author Macbook
 */
public class q28 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q28: indice ="+indice);

        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            AnalisisLexico.resultadoAnalisis+="<}>";
            q0.analisis(cadena, indice+1);
        } 
        else { // Si esta en el ultimo caracter, termina el programa 
            AnalisisLexico.resultadoAnalisis+="<}>";
            qf.end();
        }
    }
}
