/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

/**
 *
 * @author wolf
 */

/*
 Clase Lexema, la clase lexema tiene 3 parametros en su contrucción, componente lexico, tipo de dato y valor
 * 
 * {componente lexico}     {Tipo}   {Valor}
 *  <identificador>        {Int}x = {12345}
 * 
 * Durante el primer analisis no conoceremos el tipo de dato pues es determinado por el analisis sintactico,
 * por lo tanto le asignaremos null
 */
public class Lexema {
    
    private String valorVariable;
    private String tipoDeDato;
    private String componenteLexico;
    
    public Lexema(String compLexico, String tipo, String valor) {
        this.tipoDeDato=tipo;
        this.valorVariable=valor;
    }
    
    public void setCompLex(String compLex){
        this.componenteLexico=compLex;
    }
    
    public void setValorVariable(String valor){
        this.valorVariable=valor;
    }
    
    public void setTipoDato(String tipoDato){
        this.tipoDeDato=tipoDato;
    }
    
    public String getCompLex(){
        return componenteLexico;
    }
    
    public String toString(){
        return "compLex:"+this.componenteLexico;
    }
}
