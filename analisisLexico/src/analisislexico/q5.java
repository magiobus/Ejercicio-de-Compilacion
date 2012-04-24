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
public class q5 {
    public static void analisis(char cadena[],int indice){
        String valorLexema="";
        if(indice < cadena.length-1){
            System.out.println("q5");
            if(MapaDeCaracteres.isDigit(cadena[indice])){
                q5.analisis(cadena, indice+1);
            } 
            else if (cadena[indice]=='E'){
                q6.analisis(cadena, indice+1);
            }
            else{
                for(int c = TablaDeSimbolos.inicioLexema; c<indice;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                        valorLexema=valorLexema+cadena[c];
                    }
                    AnalisisLexico.resultadoAnalisis+="<num,"+valorLexema+">";
                    q0.analisis(cadena, indice);
            }
        }
        else { // Si esta en el ultimo caracter
            try{    //si al final hay un caracter
                if(MapaDeCaracteres.isDigit(cadena[indice])){
                    for(int c = TablaDeSimbolos.inicioLexema; c<indice;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                        valorLexema=valorLexema+cadena[c];
                    }
                    AnalisisLexico.resultadoAnalisis+="<num,"+valorLexema+">";
                    qf.end();
                }
                else{
                    qe.analisis(cadena, indice);
                }
            }
            catch(Exception ex){//si no lo hay...
                qe.analisis(cadena, indice);
            }
        }
    }
}
