/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

import AnalisisGeneral.TablaDeSimbolos;

/**
 *
 * @author Gama-Sennin
 */
public class q6 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q6");
        String valorLexema="";
        if(indice < cadena.length-1){
            if(MapaDeCaracteres.isDigit(cadena[indice])){
                q8.analisis(cadena, indice);
            }
            if(cadena[indice]=='+' || cadena[indice]=='-'){
                q7.analisis(cadena, indice+1);
            }            
            else{
                System.out.println("asdsafas");
               qe.analisis(cadena, indice);
            }
        }
        else { // Si esta en el ultimo caracter
            try{
                if(MapaDeCaracteres.isDigit(cadena[indice])){
                    q8.analisis(cadena, indice+1);
                }
                else{
                    qe.analisis(cadena, indice);
                }
            }
            catch(Exception ex){
                qe.analisis(cadena, indice);
            }
        }
    }
}
