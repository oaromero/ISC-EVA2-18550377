
/**
 *
 * @author Oscar Aron Romero Camacho
 */
// se crea una clase implementando la clase persona 
public class Empleado extends persona {
    // se crean su atributo
    private String rfc;
// sus metodos get y set
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
//Metodo sobreescrito en el que imprime el nombre, apellido y el RFC del empleado
    @Override
    public void imprimirNombre() {
        System.out.println("Empleado: " + getNombre() + " " + getApellido() + " " + getRfc());
    }   
}
