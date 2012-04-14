package analisislexico;

public class MapaDeCaracteres {
    
    static int i;
    static char MAPA[] = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                           'q','r','s','t','u','v','w','x','y','z',
                           'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
                           'Q','R','S','T','U','V','W','X','Y','Z',
                            1,2,3,4,5,6,7,8,9,0,
                           '>','<',':','=',';','+','-','*','/','(',')','{','}',
                           '¬','.',',','"'};
    
    public static boolean isValid(char caracter){
        
        for(i=0;i<MAPA.length;i++){
            if(caracter == MAPA[i]) return true;
        }
        return false;
    }
    
    public static boolean isDigit(char digit){
        switch(digit){
            case '1': return true;
            case '2': return true;
            case '3': return true;
            case '4': return true;
            case '5': return true;
            case '6': return true;
            case '7': return true;
            case '8': return true;
            case '9': return true;
            case '0': return true;
            default: return false;
        }
    }
    
    public static boolean isChar(char caracter){
        for (i=0;i<52;i++){
            if(caracter == MAPA[i]) return true;
        }
        return false;
    }
}
