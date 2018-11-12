
import MisClases.Automovil;
import MisClases.Avion;
import MisClases.Motocicleta;
import MisClases.Vehiculo;

/*
 * es cuando un objeto de una clase se comporta como objeto de otra clase.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil Amov = new Automovil();
        Motocicleta Mcicle = new Motocicleta();
        Avion Avio = new Avion();
        
        Amov.seguridad();
        Amov.setRuedas(4);
      
        imprimirRuedas(Amov);
        
        Mcicle.chopper();
        Mcicle.setRuedas(2);
        System.out.println("Ruedas del Vehiculo" + Mcicle.getRuedas());
    }
    
    public static void imprimirRuedas(Vehiculo arg){
        String Amov = " ";
        if( arg instanceof Automovil)
            Amov = "Automivil";
        else if ( arg instanceof Motocicleta)
            Amov = "Motocicleta";
        else
          Amov = "Avion";   
        System.out.println("Ruedas del vehiculo " + arg.getRuedas());
        
        
        // si es un automovil, imprimir seguridad 
        if( arg instanceof Automovil){
            // convertir el vehiculo 
            
        }
}
}


