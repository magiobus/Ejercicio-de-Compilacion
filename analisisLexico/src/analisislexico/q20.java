/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

/**
 *
 * @author Macbook
 */
public class q20 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q20: indice ="+indice);

        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            indice++;
            q0.analisis(cadena, indice);
<<<<<<< HEAD
            
          } else { // Si esta en el ultimo caracter, termina el programa 
              System.out.println("fin programa");
              System.exit(0);
            }
  }
=======
        }else { // Si esta en el ultimo caracter, termina el programa 
            System.out.println("fin programa");
            System.exit(0);
        }        
    }
>>>>>>> f07f3da0ccf4896ce23cc1061d5e6878bf88baa1
}
