package analisislexico;
 /*                                 *| 
 |*                                 *|
 |*             By Wolf             *|
 |*                                 *|
 |*                                 */
public class q0 {
    public static void analisis(char cadena[],int indice){
        System.out.println("q0: indice =" + indice);
        
        /*Si el caracter guardado que recibe es un enter, lo ignora y pasa al siguiente caracter*/
        if(cadena[indice] == '\n' && indice < cadena.length-1){
            indice = indice+1;
            q0.analisis(cadena, indice);
        }
        /*Si el caracter guardado que recibe es un "tab", lo ignora y pasa al siguiente caracter*/
        if(cadena[indice] == '\t' && indice < cadena.length-1){
            indice = indice+1;
            q0.analisis(cadena, indice);
        }
        
        /* Si esta posicionado en el ultimo caracter 
         * y este es un espacio un tab o una linea nueva
         * termina el analisis*/
        if((cadena[indice] == ' '||cadena[indice] == '\t'||cadena[indice] == '\n') 
                && indice == cadena.length-1 ){
            System.out.println("Fin");
            System.exit(0);
        }
        
        if(cadena[indice] == ' ' && indice < cadena.length-1){ 
            indice = indice+1;
            q0.analisis(cadena, indice);
        }
  /* Si el arreglo recibido en la posición actual tiene un caracter, se envia a q1 */
        if(MapaDeCaracteres.isChar(cadena[indice])) q1.analisis(cadena, indice+1);
  /* Si el arreglo recibido en la posición actual tiene un digito/numero, se envia a q3 */
        else if(MapaDeCaracteres.isDigit(cadena[indice])) q3.analisis(cadena, indice+1);
  /* En caso de no coincidir con numeros o caracter revisa los siguientes */      
        else{
            switch(cadena[indice]){
                case '<': q20.analisis(cadena,indice+1);break;
                case '>': q14.analisis(cadena,indice+1);break;
                case '=': q17.analisis(cadena,indice+1);break;
                case ':': q18.analisis(cadena,indice+1);break;
                case '+': q20.analisis(cadena,indice+1);break;
                case '-': q21.analisis(cadena,indice+1);break;
                case '*': q22.analisis(cadena,indice+1);break;
                case '/': q23.analisis(cadena,indice+1);break;
                case ';': q24.analisis(cadena,indice+1);break;
                case '(': q25.analisis(cadena,indice+1);break;
                case ')': q26.analisis(cadena,indice+1);break;
                case '{': q27.analisis(cadena,indice+1);break;
                case '}': q28.analisis(cadena,indice+1);break;
                case '¬': q29.analisis(cadena,indice+1);break;
                case ',': q30.analisis(cadena,indice+1);break;
                case '.': q32.analisis(cadena,indice+1);break;
            
                default: qE; //si no coincide con nada mandara por default a un estado de error
            }
        }
    
    }
}
