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
public class q3 {
    public static void analisis(char cadena[],int indice){
    
        String valorLexema="";
        
            /*si el caracter procesado no es valido*/
        if(!MapaDeCaracteres.isValid(cadena[indice])&&!(cadena[indice] == ' '||cadena[indice] == '\t'||cadena[indice] == '\n')){ 
            System.err.println(cadena[indice]);
            qe.analisis(cadena, indice);
        }
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            if(MapaDeCaracteres.isDigit(cadena[indice])){   //analisis recursivo del numero mientras este sea solo digitos
                System.out.println("q3: indice =" + indice ); 
                q3.analisis(cadena, indice+1);
            }
            else{   //si deja de cumplir con ser solo digitos...
                if(cadena[indice] == '.' ){ //si el caracter es un punto
                    indice = indice+1;
                    q4.analisis(cadena, indice);
                }
                else if(MapaDeCaracteres.isChar(cadena[indice])){ //si el caracter es una letra
                    qe.analisis(cadena, indice);
                }
                else{ 
                    for(int c = TablaDeSimbolos.inicioLexema; c<indice;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                        valorLexema=valorLexema+cadena[c];
                    }
                    AnalisisLexico.resultadoAnalisis+="<num,"+valorLexema+">";
                    q0.analisis(cadena, indice);
                }
            }       
        }
        else { // Si esta en el ultimo caracter, termina el programa
            if(MapaDeCaracteres.isDigit(cadena[indice])){
                for(int c = TablaDeSimbolos.inicioLexema; c<indice+1;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                    valorLexema=valorLexema+cadena[c];
                }

                AnalisisLexico.resultadoAnalisis+="<num,"+valorLexema+">";
                qf.end();
            }
            else if(MapaDeCaracteres.isChar(cadena[indice])){
                qe.analisis(cadena, indice);
            }
            else qe.analisis(cadena, indice);
        }
    }
}
