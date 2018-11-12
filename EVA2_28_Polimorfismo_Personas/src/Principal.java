
/**
 *
 * @author Oscar Aron romero  Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Objeto para la clase Empleado
        Empleado eEmp = new Empleado();
        //Guarda los datos ingresados en los atributos de la clase Empleado y los heredados de Persona
        eEmp.setNombre("Oscar");
        eEmp.setApellido("Romero");
        eEmp.setRfc("rew");
        
        Alumno aAlu = new Alumno();
        aAlu.setNombre("Oscar");
        aAlu.setApellido("Romero");
        aAlu.setRfc("12w34455");
        imprimirDatos(eEmp);
        imprimirDatos(aAlu);
    }// imprime los datos usando el metodo imprimir datos 
    public static void imprimirDatos(persona pPerso){
        
    }
}
// se crea una clase abstracta 
abstract class persona{
    // se colocan sus atributos privados 
    private String nombre, apellido;
// se agregan los metodos get y set 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //metodo abstracto obligatorio para heredar en la clase hijo
   abstract public void imprimirNombre();
   
}