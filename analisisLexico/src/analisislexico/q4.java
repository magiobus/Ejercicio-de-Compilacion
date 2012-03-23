/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

/**
 *
 * @author Gama-Sennin
 */
public class q4 {
    public static void analisis(char cadena[],int indice){
        if(indice < cadena.length){
            System.out.println("q4");
           if(MapaDeCaracteres.isDigit(cadena[indice])){
               indice= indice + 1;
               q5.analisis(cadena, indice);}
        
           if(cadena[indice] == 'E'){
           q6.analisis(cadena, indice);
           }
            else
            qe.analisis(cadena, indice);  
        }
        else { // Si esta en el ultimo caracter, termina el programa 
            System.out.println("fin programa");
            System.exit(0);
            }   
    }

}
