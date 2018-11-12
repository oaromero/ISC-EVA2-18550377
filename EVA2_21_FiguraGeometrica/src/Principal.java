
import MisClases.ClasePunto;
import MisClases.Color;
import MisClases.AnchoLinea;
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
        // se crae un objeto 
        ClasePunto pObj = new ClasePunto();
        // se despligan los datos de las cordenadas
        pObj.setCordX(0);
        pObj.getCordX();
        pObj.setCordY(0);
        pObj.getCordY();
        // se  crea un objeto para el color 
        Color cCol = new Color();
        cCol.setColor("Blue");
        cCol.getColor();
       // se crea un objeto para el ancho de la linea 
        AnchoLinea aLinea = new AnchoLinea();
        aLinea.setGrosor(0);
        aLinea.getGrosor();
        
        
        
    }
  
}
class Blue {
    private Color Blue;

    public Color getBlue() {
        return Blue;
    }

    public void setBlue(Color Blue) {
        this.Blue = Blue;
    }
    
}
class Figura{
    private ClasePunto Esqsuperior;

    public ClasePunto getEsqsuperior() {
        return Esqsuperior;
    }

    public void setEsqsuperior(ClasePunto Esqsuperior) {
        this.Esqsuperior = Esqsuperior;
    }
    
}
abstract class Area{
  abstract public void CalcularArea();
}
abstract class Dibujar{
    abstract public void DibujarFigura();
}