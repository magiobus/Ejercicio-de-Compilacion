/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;
import General.TablaDeSimbolos;
import General.Lexema;
/**
 *
 * @author Gama-Sennin
 */
public class q3 {
    public static void analisis(char cadena[],int indice){
    
        String valorLexema="";
        
        if(indice < cadena.length){ // Revisa si no esta en el ultimo caracter 
            if(MapaDeCaracteres.isDigit(cadena[indice])){   //analisis recursivo del numero mientras este sea solo digitos
                System.out.println("q3: indice =" + indice ); 
                q3.analisis(cadena, indice+1);
            }
            else{   //si deja de cumplir con ser solo digitos...
                if(cadena[indice] == '.' ){ //si el caracter es un punto
                    indice = indice +1 ;
                    q4.analisis(cadena, indice);
                }
                else if(MapaDeCaracteres.isChar(cadena[indice])){ //si el caracter es una letra
                    qe.analisis(cadena, indice);
                }
                else if(cadena[indice] == ' '){ //si el caracter es un espacio en blanco
                    for(int c = TablaDeSimbolos.inicioLexema; c<indice;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                        valorLexema=valorLexema+cadena[c];
                    }
                    AnalisisLexico.resultadoAnalisis+="<num,"+valorLexema+">";
                    q0.analisis(cadena, indice);
                }
            }       
        }
        else { // Si esta en el ultimo caracter, termina el programa
            for(int c = TablaDeSimbolos.inicioLexema; c<indice;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                valorLexema=valorLexema+cadena[c];
            }
            
            AnalisisLexico.resultadoAnalisis+="<num,"+valorLexema+">";
            System.out.println("fin programa"); //mensaje de que el programa terminara
            System.out.println(AnalisisLexico.resultadoAnalisis); //imprime la tabla de simbolos
            System.exit(0);
        }
    }
}
