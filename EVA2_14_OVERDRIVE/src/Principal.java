
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
        // se crea objeto de animal y de mamifero
        Animal aAni = new Animal();
        Mamifero mMam = new Mamifero();
        Mamifero mJirafa = new Mamifero("pararse");
    }
}
//se crea una clase en base la clase animal 
class Mamifero extends Animal {
    //se crea un constructor 
        public Mamifero(){
           // Lo primero es llamar al constructor de la clase base
           super(); //para llamar el metodo de la clase base o superior (padre)
        }
        public Mamifero(String accion){
            super(accion);//llama el metodo accion de la clase 
            // despliega mensaje 
            System.out.println("Y salir corriendo");
        }
    }
// se crea la clase animal 
class Animal{
    //se crea un constructor sin parametros 
    public Animal (){
        // se despliegra o imprime mensaje
        System.out.println("Respirando");
    }
    // se crea unc constructor con parametros
    public Animal(String accion){
        // imprime mensaje
        System.out.println("Respirar y " + accion);
    }
}