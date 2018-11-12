/*
 * TAREA para que sirve un constructor Privado
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
        // Se crea una varible para la clase Operaciones
        Operaciones oObj = new Operaciones();
        //Se despliega el mensaje con la funcion suma y la cantidad a resolver 
        System.out.println("La suma de 5 + 7 = " + oObj.suma(5, 7));
        System.out.println("La suma de juan y perez es: " + oObj.suma("Juan", "Perez"));
        
        
        System.out.println("true AND false ES: " + oObj.suma(true, true));
    }
    
}
// Se crea una clase en el cual crearemos algunas varibles para la resolucion del problema 
class Operaciones{
    public int suma(int iVall, int iVall2){
        return iVall + iVall2;
    }
    public String suma(String sVall, String sVall2){
        return sVall + sVall2; // concatenando
    }
    public boolean suma(boolean bVall, boolean bVall2){
        return bVall && bVall2; // AND
        
    }
}