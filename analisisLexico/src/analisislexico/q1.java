package analisislexico;

import AnalisisGeneral.Lexema;
import AnalisisGeneral.TablaDeSimbolos;
 /*                                 *| 
 |*                                 *|
 |*             By Wolf             *|
 |*           Final version         *|
 |*                                 */

public class q1 {
    public static void analisis(char cadena[],int indice){
        String valorLexema="";
        Lexema lex = new Lexema(null,null, null);
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
                /* Mientras el caracter del arreglo en posición "indice" sea un digito o un caracter los procesara recursivamente*/
            if(MapaDeCaracteres.isChar(cadena[indice]) || MapaDeCaracteres.isDigit(cadena[indice])){
                q1.analisis(cadena, indice+1);
            }
            else{   //al terminar de procesar la cadena
                for(int c = TablaDeSimbolos.inicioLexema; c<indice;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                    valorLexema=valorLexema+cadena[c];
                }
                
                if(!TablaDeSimbolos.tablaHash.containsKey(valorLexema)){ // revisamos si no esta el identificador en la tabla
                  
                    lex.setCompLex("id"+TablaDeSimbolos.contadorIds); // Se le asigna un componente lexico
                    TablaDeSimbolos.contadorIds=TablaDeSimbolos.contadorIds+1; //incrementa el contador de identificadores
                    TablaDeSimbolos.tablaHash.put(valorLexema,lex); //agrega el lexema a la tabla
                    
                    AnalisisLexico.resultadoAnalisis+="<"+lex.getCompLex()+">"; //Se añade al resultado del analisis
                    
                    q0.analisis(cadena, indice); //llama a q0 para continuar el analisis
                }
                else{ //si el identificador ya esta en la tabla continua el analisis
                    AnalisisLexico.resultadoAnalisis+="<"+TablaDeSimbolos.tablaHash.get(valorLexema).getCompLex()+">";//se añade su componente
                    q0.analisis(cadena, indice);
                }
            }
        }    
        
        else { // Si esta en el ultimo caracter, termina el programa
            try{ //si esta sobre el ultimo caracter y este es parte del identificador terminara de procesarlo
                if(MapaDeCaracteres.isChar(cadena[indice]) || MapaDeCaracteres.isDigit(cadena[indice])){
                    indice++;
                }
                else {
                    for(int c = TablaDeSimbolos.inicioLexema; c<indice;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                        valorLexema=valorLexema+cadena[c];
                    }
            
                    if(!TablaDeSimbolos.tablaHash.containsKey(valorLexema)){    // revisamos si no esta el identificador en la tabla
                        lex.setCompLex("id"+TablaDeSimbolos.contadorIds); //le asigna un componente lexico
                        TablaDeSimbolos.tablaHash.put(valorLexema,lex); //agrega el lexema a la tabla
                        TablaDeSimbolos.contadorIds=TablaDeSimbolos.contadorIds+1; //incrementa el contador de identificadores
                        AnalisisLexico.resultadoAnalisis+="<"+lex.getCompLex()+">"; //Se añade al resultado del analisis
                    }
                    else{
                        AnalisisLexico.resultadoAnalisis+="<"+TablaDeSimbolos.tablaHash.get(valorLexema).getCompLex()+">";// se añade su componente 
                    }
                    q0.analisis(cadena, indice);
                }
            }
            catch(Exception ex){} //si el caracter es vacio provocara un error de ArrayOutOfBounds, el cual ignoraremos
            for(int c = TablaDeSimbolos.inicioLexema; c<indice;c++){ //lee el valor del lexema procesado y lo asigna a la variable 
                valorLexema=valorLexema+cadena[c];
            }
            
            if(!TablaDeSimbolos.tablaHash.containsKey(valorLexema)){    // revisamos si no esta el identificador en la tabla
                
                lex.setCompLex("id"+TablaDeSimbolos.contadorIds); //le asigna un componente lexico
                TablaDeSimbolos.tablaHash.put(valorLexema,lex); //agrega el lexema a la tabla
                TablaDeSimbolos.contadorIds=TablaDeSimbolos.contadorIds+1; //incrementa el contador de identificadores
                AnalisisLexico.resultadoAnalisis+="<"+lex.getCompLex()+">"; //Se añade al resultado del analisis
                
                qf.end();
            }
            else{
                AnalisisLexico.resultadoAnalisis+="<"+TablaDeSimbolos.tablaHash.get(valorLexema).getCompLex()+">";// se añade su componente 
                qf.end();
            }
        }
    }
}
