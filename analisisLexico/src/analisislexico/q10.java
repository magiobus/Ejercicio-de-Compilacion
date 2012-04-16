/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

/**
 *
 * @author wolf ~Final version~
 */
public class q10 {
     public static void analisis(char cadena[],int indice){
        System.out.println("q10: indice ="+indice);
 
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            if(cadena[indice]=='>'){
                AnalisisLexico.resultadoAnalisis+="<<>>"; //Se añade al resultado del analisis
                q0.analisis(cadena, indice+1);
            }
            else if(cadena[indice]=='='){
                AnalisisLexico.resultadoAnalisis+="<<=>"; //Se añade al resultado del analisis
                q0.analisis(cadena, indice+1);
            }
            else{
                AnalisisLexico.resultadoAnalisis+="<<>"; //Se añade al resultado del analisis
                q0.analisis(cadena, indice);
            }
        }
        else { // Si esta en el ultimo caracter, termina el programa 
            try{
                if(cadena[indice]=='>'){
                    AnalisisLexico.resultadoAnalisis+="<<>>"; //Se añade al resultado del analisis
                    qf.end();
                }
                else if(cadena[indice]=='='){
                    AnalisisLexico.resultadoAnalisis+="<<=>"; //Se añade al resultado del analisis
                    qf.end();
                }
                else if(MapaDeCaracteres.isValid(cadena[indice])){
                    AnalisisLexico.resultadoAnalisis+="<<>"; //Se añade al resultado del analisis
                    q0.analisis(cadena, indice);
                }
            }
            catch(Exception ex){
                AnalisisLexico.resultadoAnalisis+="<<>"; //Se añade al resultado del analisis
                qf.end();
            }
        }        
    }
}
