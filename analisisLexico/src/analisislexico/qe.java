package analisislexico;

/*                                  *|
 |*                                 *|
 |*             By Wolf             *|
 |*         Final version           *|
 |*                                 */

public class qe {
    public static void analisis(char cadena[],int indice){
        String error="";
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter
            if(indice>5){// controla que el mensaje solo se muestre si el indice se a movido almenos 5 veces
                for(int i= indice-5;i<indice;i++){
                    error = error+cadena[i]; // Se concatena la cadena hasta donde se a leido
                }
                System.err.println("Error lexico cerca de '"+error+"'");
                q0.analisis(cadena, indice);
            }
            else{
                System.err.println("Error lexico cerca del inicio");
                q0.analisis(cadena, indice);
            }
        }
        else{   //Si esta en el ultimo caracter
            if(indice>5){// controla que el mensaje solo se muestre si el indice se a movido almenos 5 veces
                for(int i= indice-5;i<indice;i++){
                    error = error+cadena[i]; // Se concatena la cadena hasta donde se a leido
                }
                System.err.println("Error lexico cerca de '"+error+"'");
                qf.end();
            }
            else{
                System.err.println("Error lexico cerca del inicio");
                qf.end();
            }
        }
    }
}
