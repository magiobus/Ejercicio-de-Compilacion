/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

import General.TablaDeSimbolos;

/**
 *
 * @author wolf
 */
public class q33 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q33: indice ="+indice);
        String valorLexema="";
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            if(cadena[indice]=='"'){
                for(int c = TablaDeSimbolos.inicioLexema; c<indice+1;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                        valorLexema=valorLexema+cadena[c];
                    }
                    AnalisisLexico.resultadoAnalisis+="<cadena,"+valorLexema+">";
                    q0.analisis(cadena, indice);
            }
            else if(MapaDeCaracteres.isValid(cadena[indice])){
                q33.analisis(cadena, indice+1);
            }
                
        } 
        else { // Si esta en el ultimo caracter, termina el programa
            if(cadena[indice]=='"'){
                for(int c = TablaDeSimbolos.inicioLexema; c<indice+1;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                            valorLexema=valorLexema+cadena[c];
                }
                AnalisisLexico.resultadoAnalisis+="<cadena,"+valorLexema+">";
            }
            qf.end();
        }
    }
}
