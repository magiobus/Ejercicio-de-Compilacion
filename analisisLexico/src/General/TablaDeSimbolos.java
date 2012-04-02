/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import java.util.Hashtable;

/**
 *
 * @author wolf
 */
public class TablaDeSimbolos {
                            /*declaracion de variables globales*/
    public static Hashtable<String, Lexema> tablaHash = new Hashtable<String, Lexema>(); //tabla para guardar lexemas
    public static int contadorIds=0; //contador para controlar el numero de identificadores
    public static int inicioLexema=0; //indice para medir el inicio de un lexema
    
    static{
                            //Declaracion de la tabla de simbolos
        //Declaracion de las palabras reservadas        
        //las palabras reservadas no tienen ni tipo ni valor, solo el lexema y su componente lexico
//        tablaHash.put("int", new Lexema("int",null, null)); //palabra reservada int
//        tablaHash.put("float", new Lexema("float",null, null)); //palabra reservada float
//        tablaHash.put("string", new Lexema("string",null, null)); //palabra reservada string
        //Fin de la declaracion de palabras reservadas
    }
    
}
