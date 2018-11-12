
import MisClases.Guitarra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
          //Objeto de la clase Guitarra
        Guitarra gMiGuitarra = new Guitarra();
        
        //Solicita la información de los atributos y métodos
        gMiGuitarra.setNombre("Gibson");
        gMiGuitarra.setNumeroCuerdas(6);
        gMiGuitarra.efectos("Wah");
        gMiGuitarra.amplificador(1000);
        //Muestra el método tocarInstrumento de guitarra
        gMiGuitarra.tocarInstrumento();
    }
    
}
