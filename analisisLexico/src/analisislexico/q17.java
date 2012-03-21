
package analisislexico;

/**
 *
 * @author wolf
 */
public class q17 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q18: indice ="+indice);
 
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            /*retorno de componente lexico "igual a"*/    
            q0.analisis(cadena,indice+1);    
        }
        
        else { // Si esta en el ultimo caracter, termina el programa 
            System.out.println("fin programa");
            System.exit(0);
        }        
    }
}
