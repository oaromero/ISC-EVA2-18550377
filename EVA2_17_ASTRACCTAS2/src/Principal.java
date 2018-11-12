
/**
 *
 * @author Oscar Aron romero camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Caballo cHorse = new Caballo();
        cHorse.movimiento(); //Impresión de método movimiento heredado de la clase Animal
        
    }
    
}
//Clase Caballo que hereda métodos de la clase Animal
class  Caballo extends Animal{ 
    @Override 
    public void movimiento(){
        //Llama al método movimiento de la clase Padre
        super.movimiento(); 
        //Muestra nuevo mensaje en el método
        System.out.println("Galopar"); 
    }
}
//Clase abstracta Animal
abstract class Animal{
    //Método movimiento que imprime un mensaje
    public void movimiento(){ 
        System.out.println("Algún tipo de movimiento");
    }
}