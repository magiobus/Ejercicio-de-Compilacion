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
        Lexema lex = new Lexema(null,null, null);
    
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

                    lex.setValor(valorLexema); //coloca el valor en el lexema
                    TablaDeSimbolos.tablaHash.put("numero"+TablaDeSimbolos.contadorIds,lex); //agrega el lexema a la tabla
                    System.out.println("agregado identificador numero "+TablaDeSimbolos.contadorIds); 
                    TablaDeSimbolos.contadorIds=TablaDeSimbolos.contadorIds+1; //incrementa el contador de identificadores
                    q0.analisis(cadena, indice);
                }
            }       
        }
        else { // Si esta en el ultimo caracter, termina el programa
            for(int c = TablaDeSimbolos.inicioLexema; c<indice;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                valorLexema=valorLexema+cadena[c];
            }
            
            lex.setValor(valorLexema); //coloca el valor en el lexema
            TablaDeSimbolos.tablaHash.put("numero"+TablaDeSimbolos.contadorIds,lex); //agrega el lexema a la tabla
            System.out.println("agregado identificador numero "+TablaDeSimbolos.contadorIds); 
            TablaDeSimbolos.contadorIds=TablaDeSimbolos.contadorIds+1; //incrementa el contador de identificadores
            System.out.println("fin programa"); //mensaje de que el programa terminara
            System.out.println(TablaDeSimbolos.tablaHash.toString()); //imprime la tabla de simbolos
            System.exit(0);
        }
    }
    
}
