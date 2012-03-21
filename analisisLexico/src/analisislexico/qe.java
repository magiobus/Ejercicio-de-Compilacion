package analisislexico;

import javax.swing.JOptionPane;

/*                                  *|
 |*                                 *|
 |*             By Wolf             *|
 |*                                 *|
 |*                                 */

public class qe {// NO terminado
    public static void analisis(char cadena[],int indice){
        String error="";
        if(indice>5){// controla que el mensaje solo se muestre si el indice se a movido almenos 5 veces
            for(int i= indice-5;i<indice;i++){
                error = error+cadena[i]; // Se concatena la cadena hasta donde se a leido
            }
            JOptionPane.showMessageDialog(null, "Error lexico cerca de '"+error+"'");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error lexico cerca del inicio");
        }
    }
}
