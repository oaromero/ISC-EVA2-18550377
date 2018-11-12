
/**
 *
 * @author Oscar Aron Romero Camacho
 */
//Principal adquiere los métodos de la interfaz
public class Principal implements ImprimirMensaje{  
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se crea un objeto para principal
        Principal pObj = new Principal();
        //Imprimesión de mensaje
        pObj.imprimeMensaje("Pamela"); 
        
        
        //ImprimirMensaje es una interfaz. NO SE PUEDEN CREAR OBJETOS EN INTERFACE.
        //CREAR UNA INTERFAZ ANÓNIMA QUE IMPLEMENTA LOS MÉTODOS DE LA INTERFAZ
        ImprimirMensaje objImprimir = new ImprimirMensaje(){
            @Override
            public void imprimeMensaje(String sMensa) {
                System.out.println("Hola " + sMensa);
            }
            
        };
        //Se imprime mensaje llamando al objeto de la clase anónima
        objImprimir.imprimeMensaje("Karla");
        
    }

    //Método sobreescrito de ImprimeMensaje
    @Override
    public void imprimeMensaje(String sMensa) {
        System.out.println("Hola " + sMensa);
    }
    
}

//Interfaz 
interface ImprimirMensaje{
    public void imprimeMensaje(String sMensa);
}


  