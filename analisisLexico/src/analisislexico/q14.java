package analisislexico;

 /*                                 *| 
 |*                                 *|
 |*             By Wolf             *|
 |*           Final version         *|
 |*                                 */

public class q14 {
     public static void analisis(char cadena[],int indice){
        System.out.println("q14: indice ="+indice);
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter
            if(cadena[indice] == '='){
                AnalisisLexico.resultadoAnalisis+="<>=>"; //>= no ultimo
                q0.analisis(cadena, indice+1);
             }
            else{
                AnalisisLexico.resultadoAnalisis+="<>>"; // > sin ser ultimo caracter
                q0.analisis(cadena,indice);
            }
        } 
        else{// Si esta en el ultimo caracter, termina el programa   
            try{
                if(cadena[indice] == '=' ){
                    AnalisisLexico.resultadoAnalisis+="<>=>"; //>= siendo ultimo
                    qf.end();
                }
                else{ 
                    AnalisisLexico.resultadoAnalisis+="<>>";
                    q0.analisis(cadena, indice);
                }
            }
            catch(Exception ex){
                AnalisisLexico.resultadoAnalisis+="<>>"; //>= siendo ultimo
                qf.end();
            }
        } 
    }
}
