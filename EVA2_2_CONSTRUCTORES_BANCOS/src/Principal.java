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
        // crearemos una varible que nos permita utilizar la clase Banco 
        Banco bMiCuenta = new Banco();
        // Atravez del metodo get y set desplegaremos o imprimiremos los datos de los atrivutos
        System.out.println("Nombre del cliente: " + bMiCuenta.getNombreCliente());
        System.out.println("Saldo del cliente: " + bMiCuenta.getSaldo());
        
        Banco bMiCuenta2 = new Banco("Josue Perez Jolote", 5000);
        System.out.println("Nombre del cliente: " + bMiCuenta2.getNombreCliente());
        System.out.println("Saldo del cliente: "+ bMiCuenta2.getSaldo());
        
    }
    
}
class Banco{
    // Se declararon los atributos que son el nombre y el saldo 
    // Metodo String para desplegar un algo conformado por palabras y el double para numeros decimales.
    private String nombreCliente;
    private double Saldo;
    //En el public se declaran los valores de los atributos.
public Banco(){
    nombreCliente = "Oscar Aron Romero Camacho";
    Saldo = 10000;
}
    // representa una sobrecarga de una misma clase
    public Banco(String nombreCliente, double Saldo) {
        this.nombreCliente = nombreCliente;
        this.Saldo = Saldo;
    }
     // Se crean los metodos get y set de los dos atributos 
    // source ---> Insert code ----> get and set.
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
}