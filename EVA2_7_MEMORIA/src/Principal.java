
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
        //se imprime un mensaje del menu
        System.out.println("Iniciando Main");
        A();
        System.out.println("Terminando Main");
        
    }
    // Las clases se llaman unas entre otras 
    public static void A(){
        System.out.println("Iniciando A");
        B();
        System.out.println("Terminando A");
    }
    public static void B(){
         System.out.println("Iniciando B");
        C();
        System.out.println("Terminando B");
    }
    public static void C(){
       System.out.println("Iniciando C");
       System.out.println("Terminando C");
    }
}
