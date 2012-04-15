package analisislexico;

import analisislexico.MapaDeCaracteres;

 /*                                 *| 
 |*                                 *|
 |*             By Wolf             *|
 |*                                 *|
 |*                                 */

public class q14 {
     public static void analisis(char cadena[],int indice){
        System.out.println("q14: indice ="+indice);
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter
            if(cadena[indice] == '='){
                AnalisisLexico.resultadoAnalisis+="< >= >"; //>= no ultimo
                indice++;
                if(indice < cadena.length-1){
                    q0.analisis(cadena,indice+1);    
                } 
             } 
            
            AnalisisLexico.resultadoAnalisis+="< > >"; // > sin ser ultimo caracter
            q0.analisis(cadena,indice+1);
            
        } else {// Si esta en el ultimo caracter, termina el programa 
            
            if(cadena[indice] == '=' ){
                AnalisisLexico.resultadoAnalisis+="< >= >"; //>= siendo ultimo
                qf.end();
            }
            
            
             //   AnalisisLexico.resultadoAnalisis+="< > >"; // > siendo ultimo(no funciona)
            //    qf.end();
        } 
    }
}
