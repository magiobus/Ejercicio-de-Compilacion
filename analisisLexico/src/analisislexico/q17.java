
package analisislexico;

/**
 *
 * @author wolf
 */
public class q17 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q17: indice ="+indice);
 
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            AnalisisLexico.resultadoAnalisis+="<=>"; //Se añade al resultado del analisis    
            q0.analisis(cadena,indice+1);    
        }
        
        else { // Si esta en el ultimo caracter, termina el programa 
            AnalisisLexico.resultadoAnalisis+="<=>"; //Se añade al resultado del analisis
            qf.end();
        }        
    }
}
