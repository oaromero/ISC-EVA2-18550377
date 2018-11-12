

/**
 *
 * @author Oscar Aron Romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}// se crea una clase implementando la interfas comportamiento animal y la clase obtiene metodos abstractos
class Caballo implements ComportamientoAnimal{
    @Override
    public void movimiento(){
        System.out.println("galopar");
    }
    @Override
    public void comer(){
        System.out.println("lo que sea");
}
}
// se crea una interfaz la cual es similar al metodo abstracto 
interface ComportamientoAnimal{
    public void movimiento();
    public void comer();
    
}