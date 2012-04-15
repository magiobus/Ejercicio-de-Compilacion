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
                q0.analisis(cadena, indice+1);
            }
            else if(MapaDeCaracteres.isValid(cadena[indice])||cadena[indice]==' '||cadena[indice] == '\t'||cadena[indice] == '\n'){
                q33.analisis(cadena, indice+1);
            }
                
        } 
        else { // Si esta en el ultimo caracter, termina el programa
            try{ //se intenta leer el ultimo caracter
                if(cadena[indice]=='"'){
                    for(int c = TablaDeSimbolos.inicioLexema; c<indice+1;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                                valorLexema=valorLexema+cadena[c];
                    }
                    AnalisisLexico.resultadoAnalisis+="<cadena,"+valorLexema+">";
                }
                qf.end();
            }
            catch(Exception ex){
                qf.end();
            } // si el ultimo caracter no existe generara un error que ignoraremos y finaliza el programa
        }
    }
}
