/*
 * 
 */

/**
 *
 * @author Oscar Aron Romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Operaciones oObj = new Operaciones();
        System.out.println("Hola " + Operaciones.iValor);
        //Math para usos matematicos y para colocacion de numeros
        System.out.println(Math.cos(50));
        
    }
    
}
class Operaciones{
    // se crea un atrubuto entero estatico.  
    static int iValor = 100;
     public static int suma(int iVall, int iVall2){
        return iVall + iVall2;
    }
    public static String suma(String sVall, String sVall2){
        return sVall + sVall2; // concatenando
    }
    public static boolean suma(boolean bVall, boolean bVall2){
        return bVall && bVall2; // AND
        
    }
}