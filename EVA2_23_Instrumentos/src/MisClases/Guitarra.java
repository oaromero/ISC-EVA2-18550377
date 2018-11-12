
package MisClases;

/**
 *
 * @author Oscar Aron Romero Camacho 
 */
public class Guitarra extends InstrumentoMusical  implements  GuitarraElectrica{
   //Atributos
    private int numeroCuerdas;
    private String efectos;
    private int potencia;

    //Métodos get y set
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }
    

      //Muestra los mensajes con la información solicitada en la clase  Principal
    @Override
    public void tocarInstrumento() {
        System.out.println("Rascale!!, Guitarra con " + numeroCuerdas);
        System.out.println("La guitarra es de tipo " + getNombre());
        System.out.println("Tiene efectos: "+ efectos);
        System.out.println("Potencia del ampli " + potencia);
    }

     //Método sobreescrito de la clase GuitarraElectrica
    @Override
    public void efectos(String tipoEfecto) {
        efectos = tipoEfecto;
    }

    //Método sobreescrito de la clase GuitarraElectrica
    @Override
    public void amplificador(int potencia) {
        this.potencia = potencia;
        
    }
    
}
    

    
 