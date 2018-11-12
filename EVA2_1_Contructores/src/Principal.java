/*
 *
 */

/**
 *
 * @author Oscar Aron ROmero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // java declara un default de una clase  si no se declara      
        // CONSTRUCTOR
        // Sirve para Inicializar su clase
        Principal pObjPpal = new Principal();
        Prueba pObjPrue = new Prueba();
        System.out.println(pObjPrue.x); 
    }
 
}
//Se crea la clase y se ingreso una varible en default y un public con el cual desplegamos el valor de la x
class Prueba{
    int x;
    public Prueba() {
        x = 100;
    }
     
 }   
