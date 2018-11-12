
/**
 *
 * @author Oscar Aron Romero camacho
 */
// se crea la clase la cual deriva de persona
    public class Alumno extends persona {
        // obtine su atributo
    private String Ncon;
// se crean sus metodos get y set 
    public String getNcon() {
        return Ncon;
    }

    public void setRfc(String rfc) {
        this.Ncon = Ncon;
    }
// metodo sobreescrito que muestra un mensaje con el nombre, apellido y el numero de control del alumno
    @Override
    public void imprimirNombre() {
        System.out.println("Alumno: " + getNombre() + " " + getApellido() + " " + getNcon());
    }
   }
 