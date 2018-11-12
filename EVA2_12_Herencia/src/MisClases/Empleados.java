
package MisClases;

/**
 *
// * @author Oscar Aron Romero Camacho
 */
//Se crea una clase derivada de persona 
public class Empleados extends Persona {
    // se crea el atributo privado y se le crean sus metodos get y set
    private double Salario;
     //double para que haga uso de numeros decimales
    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
}
