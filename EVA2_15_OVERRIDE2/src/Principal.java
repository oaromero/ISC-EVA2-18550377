
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
       //se crea elobjeto animal
        Animal aAni = new Animal();
        // hace funcion de la accion movimiento
        aAni.movimiento();
        // se crea un objeto de caballo
        Caballo cHorse = new Caballo();
        // implica que el caballo tambien implementa movimiento
        cHorse.movimiento();
        // se crea un objeto de ostra
        Ostra aOstra = new Ostra();
        aOstra.movimiento();
    }
    
}
// se crea una clase que deriva de animal
class Caballo extends Animal{
    @Override // OVERRIDE sustituye el comportamiento de la clase base propio de la subclase.
    public void movimiento(){
        System.out.println("Galopar");
    }
    // Sobrecarga es el implemento de la misma clase 
    // forma de distigirlo son por los argumentos.
    public void movimiento(String sMovi){
        System.out.println(sMovi);
    }
} 
// se crea una clase que implemente la clase animal
class Ostra extends Animal{
    
}
class Animal{
    public void movimiento(){
        // imprime mensaje 
        System.out.println("Movimiento Indefinido");
    }
}