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
public class q8 {
    public static void analisis(char cadena[],int indice){
        String valorLexema="";
        if(indice <= cadena.length-1){
            System.out.println("q8"+"  "+cadena[indice]);
            if(MapaDeCaracteres.isDigit(cadena[indice])){
                q8.analisis(cadena, indice+1);
            }
            else if(MapaDeCaracteres.isValid(cadena[indice])||cadena[indice] ==' '||cadena[indice] =='\t'||cadena[indice] =='\n'){
                for(int c = TablaDeSimbolos.inicioLexema; c<indice+1;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                    valorLexema=valorLexema+cadena[c];
                }
                AnalisisLexico.resultadoAnalisis+="<num,"+valorLexema+">";
                q0.analisis(cadena, indice+1);
            }
        }
        else { // Si esta en el ultimo caracter, termina el programa 
            try{
                if(MapaDeCaracteres.isValid(cadena[indice])){
                    for(int c = TablaDeSimbolos.inicioLexema; c<indice+1;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                        valorLexema=valorLexema+cadena[c];
                    }
                    AnalisisLexico.resultadoAnalisis+="<num,"+valorLexema+">";
                    qf.end();
                }
                else{
                    System.out.println("asdsafas");
                    qe.analisis(cadena, indice);
                }
            }
            catch(Exception ex){
                /*aqui esta el error*/
                qe.analisis(cadena, indice);
            }
        }
    }
}
