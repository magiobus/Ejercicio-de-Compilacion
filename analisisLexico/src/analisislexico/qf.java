/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

import AnalisisGeneral.*;
/**
 *
 * @author wolf
 */
public class qf {
    public static void end(){
        System.out.println(AnalisisLexico.resultadoAnalisis);
        System.out.println(AnalisisGeneral.TablaDeSimbolos.tablaHash);
        System.exit(0);
    }
}
