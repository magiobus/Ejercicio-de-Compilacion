package analisislexico;

public class q1 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q1: indice ="+indice);
        int i=indice;
        /* Mientras el caracter del arreglo en posición i sea un digito o un caracter */
        while(MapaDeCaracteres.isChar(cadena[i]) || MapaDeCaracteres.isDigit(cadena[i])){
            if(i < cadena.length-1){ // Revisa si no esta en el ultimo caracter 
                i++;
            }
            else { // Si esta en el ultimo caracter, termina el programa 
                System.out.println("fin programa");
                System.exit(0);
            }
        }
        /*
         retorno de componente lexico
         
         */
        q0.analisis(cadena,i);
    }
}
