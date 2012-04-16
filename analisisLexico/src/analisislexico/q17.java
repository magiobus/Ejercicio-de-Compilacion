
package analisislexico;

/**
 *
 * @author wolf ~Final version~
 */
public class q17 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q17: indice ="+indice);
 
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            AnalisisLexico.resultadoAnalisis+="<=>"; //Se añade al resultado del analisis    
            q0.analisis(cadena,indice);    
        }
        
        else { // Si esta en el ultimo caracter, termina el programa 
            try{
                if(MapaDeCaracteres.isValid(cadena[indice])){ 
                    AnalisisLexico.resultadoAnalisis+="<=>"; //Se añade al resultado del analisis
                    q0.analisis(cadena, indice);
                }
            }
            catch(Exception ex){
                AnalisisLexico.resultadoAnalisis+="<=>"; //Se añade al resultado del analisis
                qf.end();
            }
            
                
        }        
    }
}
