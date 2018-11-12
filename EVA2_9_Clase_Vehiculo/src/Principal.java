// Se implementa los atributos de la clase vehiculo y el uso del escaner 
import Mis_Vehiculos.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Oscar Aron Romero Camacho
 */
public class Principal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //Se crea uno objeto
        Vehiculo vCarro = new Vehiculo("Bugatii", "1G76", "GC692", 2018, 1 );
        vCarro.imprimirDatos();
        //Verificamos si el Auto no esta encendido
       if (!vCarro.isEstaEncendido()){ // si no esta encendido
           vCarro.prender(); //Lo encendemos
           
     }
       // funcion para ingresar las cantidades de la velocidad que recorre
       vCarro.acelerar();
        System.out.println("Vas a Fabulosos " + vCarro.getVelocidad() + "Km/Hr");
        
        
        
        
    }

}
