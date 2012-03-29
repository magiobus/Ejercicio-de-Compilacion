package analisislexico;

import General.Lexema;
import General.TablaDeSimbolos;
import javax.swing.text.TabableView;

 /*                                 *| 
 |*                                 *|
 |*             By Wolf             *|
 |*                                 *|
 |*                                 */

public class q1 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q1: indice ="+indice);
        String valorLexema="";
        Lexema lex = new Lexema(null, null);
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
                /* Mientras el caracter del arreglo en posición i sea un digito o un caracter los procesara recursivamente*/
            if(MapaDeCaracteres.isChar(cadena[indice]) || MapaDeCaracteres.isDigit(cadena[indice])){
                q1.analisis(cadena, indice+1);
            }
            else{   //al terminar de procesar la cadena
                for(int c = TablaDeSimbolos.inicioLexema; c<indice+1;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                    valorLexema=valorLexema+cadena[c];
                }
                
                lex.setValor(valorLexema); //coloca el valor en el lexema
                TablaDeSimbolos.tablaHash.put("identificador"+TablaDeSimbolos.contadorIds,lex); //agrega el lexema a la tabla
                System.out.println("agregado identificador numero "+TablaDeSimbolos.contadorIds);
                TablaDeSimbolos.contadorIds=TablaDeSimbolos.contadorIds+1; //incrementa el contador de identificadores
                q0.analisis(cadena, indice); //llama a q0 para continuar el analisis
            }
        }    
        
        else { // Si esta en el ultimo caracter, termina el programa
         
            for(int c = TablaDeSimbolos.inicioLexema; c<indice+1;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                valorLexema=valorLexema+cadena[c];
            }
            
            lex.setValor(valorLexema); //coloca el valor en el lexema
            TablaDeSimbolos.tablaHash.put("identificador"+TablaDeSimbolos.contadorIds,lex); //agrega el lexema a la tabla
            System.out.println("agregado identificador numero "+TablaDeSimbolos.contadorIds); 
            TablaDeSimbolos.contadorIds=TablaDeSimbolos.contadorIds+1; //incrementa el contador de identificadores
            System.out.println("fin programa"); //mensaje de que el programa terminara
            System.out.println(TablaDeSimbolos.tablaHash.toString()); //imprime la tabla de simbolos
            System.exit(0); //fin programa
        }
    }
}
