package analisislexico;
 /*                                 *| 
 |*                                 *|
 |*             By Wolf             *|
 |*                                 *|
 |*                                 */

public class q1 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q1: indice ="+indice);
        String lexema="<id,"; 
        
        if(indice < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
            /* Mientras el caracter del arreglo en posición i sea un digito o un caracter */
            if(MapaDeCaracteres.isChar(cadena[indice]) || MapaDeCaracteres.isDigit(cadena[indice])){
               q1.analisis(cadena, indice+1);
            }
            else q0.analisis(cadena, indice);
        }    
        
        else { // Si esta en el ultimo caracter, termina el programa 
            System.out.println("fin programa");
            System.exit(0);
        }
        
        /*
        for(int c=indice-1;c<=i;c++){
            lexema=lexema+cadena[c];
        }
        
        lexema=lexema+">";
        System.out.println(lexema);
        q0.analisis(cadena,i);
         */
    }
}
