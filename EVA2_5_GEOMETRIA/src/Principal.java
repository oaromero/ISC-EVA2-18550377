/*
 * 
 */

/**
 *
 * @author Oscar Aron Romero Camacho
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Area de un cuadrado de lado 100 = " + Geometria.CalcularAreaCuadrado(100));
        
          
    }
    
}
class Geometria{
    // Para las constantes se utiliza final.
    static final double PI = 3.14159;
    // Los metodos estaticos existen desde que el programa inicia, y solamente se puede usar atravéz de la clase a la que pertenece.
    //No son Instaciables.
    // Son utiles para crear librerias de constantes y funciones, para usarlas sin crear objetos.
    
    public static double CalcularAreaCuadrado(double dLado){
        return dLado*dLado;
    }
    
    public static double CalcularAreaTriangulo(double lHip, double lCot){
        return lHip*lCot;
   }
} 
