// uso de las clases para emplear sus atributos
import MisClases.Clientes;
import MisClases.Empleados;
import MisClases.EstadoCivil;
import MisClases.Persona;


/**
 *
 * @author Oscar Romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se crea un objeto de persona
        Persona pObj = new Persona();
        /*pObj.setNombre("Oscar");
        pObj.setApellido("Romero");
        pObj.setEstCivil(EstadoCivil.Viudo);*/
        System.out.println("Persona");
        System.out.println(pObj.getNombre());
        
        // se crea un objeto para empleado
        Empleados eEmp = new Empleados();
        // utilizamos los set para desplegar el mensaje o resultado que indicamos 
        eEmp.setNombre("Juan");
        eEmp.setApellido("Camacho");
        eEmp.setEstCivil(EstadoCivil.Casado);
        eEmp.setSalario(1);
        
        Clientes cCli = new Clientes();
        cCli.setNombre("Pedro");
        //cCli
    }
    
}
