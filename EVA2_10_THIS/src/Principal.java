/*
 * This--> palabra reservada se usa para acceder a los mienbros de la clase.
 *  Es un apuntador al la instancia actual de la clase
 */

/**
 *
 * @author Oscar Romero Camacho 
 */
public class Principal {
    int iValor; //Creación de variable fuera de la clase principal
    //Constructor de Principal y el valor de la variable 
    public Principal(){ 
        iValor = 10; 
    }

    /**
     * @param args the command line arguments
     */
    
    static String sMensaje = "Hola"; //Variable de tipo estática que guarda un valor String

    public static void main(String[] args) {
        // TODO code application logic here
//Objeto de la clase Principal
       Principal pObj = new Principal(); 
       pObj.imprimir(); 
       pObj.imprimir2(10000);
       //Nueva variable que guarda un mensaje de tipo String 
       String sMensaje = "Nada de hola"; 
	//Mostrar la variable sMensaje		            
        System.out.println(sMensaje); 
        for (int i=0; i<10; i++) { //Ciclo para, inicia en 0 y termina hasta que el indicador sea igual a 10
            System.out.println(i); 
        }
        
       
    }
    
    public void imprimir() { //Método imprimir
        System.out.println("Valor = " + iValor); //Muestra mensaje con la variable creada antes del Main
    }
    
    public void imprimir2(int iValor) { 
        System.out.println("Valor = " + iValor); 
        System.out.println("Valor del atributo = " + this.iValor); //Muestra mensaje con el valor de la variable de la clase
    }
}

    
        
 