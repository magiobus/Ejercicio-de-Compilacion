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
    
    Hashtable<String, Lexema> tablaHash = new Hashtable<String, Lexema>();
    
    public TablaDeSimbolos() {
        
                        /*Declaracion de la tabla de simbolos*/
        
        /*Declaracion de las palabras reservadas*/            
        tablaHash.put("int", new Lexema("int", null)); //palabra reservada int
        tablaHash.put("float", new Lexema("float", null)); //palabra reservada float
        tablaHash.put("string", new Lexema("String", null)); //palabra reservada string
        /*Fin de la declaracion de palabras reservadas*/
    }
}
