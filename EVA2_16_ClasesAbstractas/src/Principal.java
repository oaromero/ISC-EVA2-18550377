/*
 * Clase Abstracta --> una que sirve para generar objetos, solo sirve como base para herencia. 
 * una Clase Final --> no se puede usar para heredar.
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
      // se crea un objeto para ostra 
        Ostra oPalCocktail = new Ostra();
        //impresion del metodo movimiento
        oPalCocktail.movimiento();
    }
    
}

//Final --> ya no se puede heredar ostra
final class Ostra extends Animal{
    
}
// se crea una clase abstracta para animal
 abstract class Animal{
     public void movimiento(){
         System.out.println("Movimiento Indefinido");
     }
 }