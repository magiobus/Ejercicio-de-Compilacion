/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

/**
 *
 * @author wolf
 */
public class q32 {
    
    public static void analisis(char cadena[],int indice){
        System.out.println("q32: indice ="+indice);
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            AnalisisLexico.resultadoAnalisis+="<.>";
            q0.analisis(cadena, indice);
        }
        else { // Si esta en el ultimo caracter, termina el programa 
            AnalisisLexico.resultadoAnalisis+="<.>";
            qf.end();
        }
    }
}
