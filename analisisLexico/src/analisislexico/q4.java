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
        if(indice < cadena.length-1){
            System.out.println("q4");
            if(MapaDeCaracteres.isDigit(cadena[indice])){
                q5.analisis(cadena, indice);
            }
            else qe.analisis(cadena, indice);  
        }
        else { // Si esta en el ultimo caracter, termina el programa 
            try{ //si el ultimo caracter es un digito
                if(MapaDeCaracteres.isDigit(cadena[indice])){
                    q5.analisis(cadena, indice+1);
                }
                else{
                    qe.analisis(cadena, indice);
                }
            }
            catch(Exception ex){ //si no existe un ultimo caracter
                qe.analisis(cadena, indice);
            }
        }   
    }
}
