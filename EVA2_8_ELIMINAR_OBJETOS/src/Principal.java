
/**
 *
 * @author Oscar Aron Romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test tObj = new Test();
        Test tCopia = tObj;
        //se esta eliminando el 100 para darle espacio al otro
        tObj.iVal = 100;
        System.out.println(tObj.iVal);
        System.out.println(tObj);
        System.out.println(tCopia);
        tObj = new Test();
        System.out.println("Señor Slim, Usted tiene: " + tObj.iVal);
        System.out.println(tObj);
        tObj = null;
         System.out.println(tObj);
         System.out.println("Pereme Sr Slim, tiene: " + tCopia.iVal);
    }
    
}
// se crea una clse y en ella una variable valor entero
class Test{
    int iVal;
}