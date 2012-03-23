/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

/**
 *
 * @author Gama-Sennin
 */
public class q5 {
    public static void analisis(char cadena[],int indice){
        if(indice <= cadena.length-1){
            System.out.println("q5");
           if(MapaDeCaracteres.isDigit(cadena[indice])){
               q5.analisis(cadena, indice+1);
           
           } 
           
           else{
               q0.analisis(cadena, indice);
           }
            
        }
        else { // Si esta en el ultimo caracter, termina el programa 
                System.out.println("fin programa");
                System.exit(0);
}
}
}
