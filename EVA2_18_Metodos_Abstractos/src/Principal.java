/*
 *Abstract es para no colocar varibles
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
        // TODO code application logic here
        // Es con lo que mando hacer la accion 
        Caballo cHorse = new Caballo();
        // imprime la accion mivimineto y comer de animal
        cHorse.movimiento();
        cHorse.comer();
    }
    
}
// se creo una clase la cual se implementa la clase abstracta y se le crean los metodos abstractos a la clase
class Avestruz extends Animal{
    @Override
    public void movimiento(){
        System.out.println("Corre A Priza");
    }
    @Override
    public void comer(){
        System.out.println("Gente loca");
    }
}
class Caballo extends Animal{

    @Override
    public void movimiento() {
        throw new UnsupportedOperationException("Galopar"); 
    }
    @Override
   public void comer(){
        System.out.println("Comer");
    }
}
// se crea una clase abstracta en la cual derivaremos los moviminetos
abstract class Animal{
    abstract public void movimiento();
     abstract public void comer();   
    
}