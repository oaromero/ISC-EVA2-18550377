

package Clase_TV;

/**
 *
 * @author Oscar Aron Romero camacho
 */
//Creo una clase para el televisor
public class Television {
    //coloco atributos
  private boolean Aprendido, VolumenEncendido;
    int Pcanal;
    int volumen;
    int canal;
    //coloco un constructor para el despliegue de los valores
    public Television(){
        canal = 1;
        volumen = 0;
    } 
    // objetivo encender y apagar el televisor con el uso de true y false 
    public void EncenderTelevisor(){
        Aprendido = true;
    }
    public void ApagarTelevisor(){
        Aprendido = false;
    }
    
    public void CambioCanal(){
        // de tal forma que valla 1 en 1
        canal = canal + 1;
        // que se encuentre encendido el televisor 
        if(Aprendido){
            // hasta el canal en el cual queremos llegar
        if(canal > 999)
           canal = 999;
        }
    }
    
    public void Retrocedercanal(){
        // para ir hacia atras en 1 en 1
        canal = canal - 1;
        // que se encuentre encendido el televisor
        if(Aprendido){
         // que el menor canal seria 1   
        if(canal < 1)
            canal = 1;
        }
    }
    
    
}

