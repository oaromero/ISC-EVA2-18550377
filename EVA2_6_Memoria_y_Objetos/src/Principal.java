
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
        // Apuntadores
        Prueba pObj = new Prueba();
        pObj.iValor = 100;
        System.out.println("El Valor Es: " + pObj.iValor);
        //Copia
        int iAlgo = 70;
        int iCopia = iAlgo;
        System.out.println("iAlgo = " + iAlgo);
        System.out.println("iCopia = "+ iCopia);
        
        iAlgo = 1000;
        System.out.println("iAlgo = " + iAlgo);
        System.out.println("iCopia = "+ iCopia);
        // Copia del Objeto
        // Los dos apunta a lo mismo, se midifica el objeto cambia la varible(referencias) que guarda la dirección .
        Prueba pCopiadoObj = pObj;
        System.out.println("El Valor Es: " + pObj.iValor);
        System.out.println("El Valor Es: " + pCopiadoObj.iValor);
        
        pObj.iValor = -1;
         System.out.println("El Valor Es: " + pObj.iValor);
        System.out.println("El Valor de la copia Es: " + pCopiadoObj.iValor);
    }
    
}
class Prueba{
    int iValor;// 4 Bytes
}