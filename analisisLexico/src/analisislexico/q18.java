package analisislexico;

/**
 *
 * @author wolf 
 */
public class q18 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q18: indice =" + indice);
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            if(cadena[indice]=='='){
                AnalisisLexico.resultadoAnalisis+="<:=>"; //Se añade al resultado del analisis
                q0.analisis(cadena, indice+1);
            }
            else {
                qe.analisis(cadena, indice); //Si despues del ":" no hay un "=" es un error lexico
            }
        }
       
        else{ //si estas sobre el ultimo caracter
                try{ //intenta leer el ultimo caracter
                    if(cadena[indice]=='='){ //si el ultimo caracter es un =
                        AnalisisLexico.resultadoAnalisis+="<:=>"; //Se añade al resultado del analisis
                        qf.end();
                    }
                    else qe.analisis(cadena, indice);
                } //si no se puede leer el caracter es porque no existe
                catch(Exception ex){
                    qe.analisis(cadena, indice);
                    
                }
        }
    }
}
