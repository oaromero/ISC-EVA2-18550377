/*
 * 
 */
package MisClases;

/**
 *
 * @author Oscar Aron romero Camacho
 */
// se crea una clase persona 
public class Persona {
    // se colocan los atrivutos en privado 
    // String para argumentos 
    // int para num. Enteros 
    private String nombre, apellido;
    private int edad, estCivil;
    private String direccion;
    // se crea un constructor de persona
    public Persona() {
        // se declaran las variables 
        nombre = "X";
        apellido = "Y";
        estCivil = EstadoCivil.Soltero;
        direccion = "Z";
    }
    
// se crean los metodos get y set de cada atributo
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(int estCivil) {
        this.estCivil = estCivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
