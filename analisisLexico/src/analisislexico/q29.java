/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

/**
 *
 * @author Macbook
 */
public class q29 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q29: indice ="+indice);     
        
        if(indice-1 == cadena.length-1){ // ¬()si no hay nada .
            qe.analisis(cadena, indice);
        }
        
        if(cadena[indice] != '¬'){ // si es ¬(mas caracteres diferentes a ¬) error
            qe.analisis(cadena, indice);
        }
       
        while(indice < cadena.length-1){
            if(cadena[indice] == '¬'){ // si es ¬(¬) y hay mas caracteres
                System.out.println("¬¬...");
                indice++;
                q0.analisis(cadena, indice);
            }
        }
        
        while(indice == cadena.length-1){
            if(cadena[indice] == '¬'){ // Si es ¬(¬) y no hay mas caracteres
                System.out.println("¬¬ Fin");
                System.out.println("fin de programa");
                System.exit(0);
            }
        }
        
        
    }
}
        
        
        
        
       
            
          
    


