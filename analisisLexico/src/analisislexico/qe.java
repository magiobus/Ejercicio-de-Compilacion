package analisislexico;

import javax.swing.JOptionPane;

/*                                 *| 
 |*                                 *|
 |*             By Wolf             *|
 |*                                 *|
 |*                                 */

public class qe {
    public static void analisis(char cadena[],int indice){
        String error="";
        if(indice>5){
            for(int i= indice-5;i<indice;i++){
                error = error+cadena[i];
            }
            JOptionPane.showMessageDialog(null, "Error lexico cerca de '"+error+"'");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error lexico cerca del inicio");
        }
    }
}
