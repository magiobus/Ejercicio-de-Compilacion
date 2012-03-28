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
            if(cadena[indice]=='='){
                /*Retorno de componente lexico "menor o igual"*/
                q0.analisis(cadena,indice+1);
            }
            else{
                if(MapaDeCaracteres.isValid(cadena[indice])){
                    /*Retorno de componente lexico "comparacion de igualdad"*/
                    q0.analisis(cadena,indice+1);
                }
            }
        }
        else { // Si esta en el ultimo caracter, termina el programa 
            System.out.println("fin programa");
            System.exit(0);
        }        
    }
}
