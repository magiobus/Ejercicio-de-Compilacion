/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

/**
 *
 * @author Macbook 
 */
public class q22 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q22: indice ="+indice);

        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            AnalisisLexico.resultadoAnalisis+="<*>"; //Se añade al resultado del analisis
            q0.analisis(cadena, indice+1);

        } else { // Si esta en el ultimo caracter, termina el programa 
            AnalisisLexico.resultadoAnalisis+="<*>"; //Se añade al resultado del analisis
            qf.end();
        }
    }
    
}
