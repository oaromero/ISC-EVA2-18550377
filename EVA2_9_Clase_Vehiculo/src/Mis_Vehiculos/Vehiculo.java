/*
 * 
 */
package Mis_Vehiculos;

/**
 *
 * @author Oscar Aron Romero Camacho
 */
 
public class Vehiculo {
    // Agregar atributos, de acceso privado
    // Agregar Constructor Default, poner valores a su gusto 
    // Agregar constructor que acepte los 4 atributos
    // Metodos para get y set para cada uno
   private String marca, modelo, matricula;
    private int año, cilindros;
    private boolean estaEncendido;
    private int velocidad;
   // constructor sin parametros 
public Vehiculo(){
        marca = "Bugatii";
        modelo = "1G76";
        matricula = "GC692";
        año = 2018;
        cilindros = 1;
        velocidad = 0;
    }
// constructor con paramentros y sus atributos desplegando los metodos get y set
    public Vehiculo(String marca, String modelo, String matricula, int año, int cilindro){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.año = año;
        this.cilindros = 1;
        this.estaEncendido = false;
        
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public int getCilindros() {
        return cilindros;
    }
    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    // Es para desplegar los mensajes
    public void imprimirDatos(){
        System.out.println("TU VEHÍCULO ES: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Tiene: " + cilindros + " cilindros");
    }
    // son las varibles para hacer funcionar el vehiculo.
    public void prender(){
        estaEncendido = true;
    }
    public void apagar(){
        estaEncendido = false;
    }
    public void acelerar(){
        if(estaEncendido)
            velocidad = velocidad + 10;
    }
    public void frenar(){
        if(estaEncendido){
            if(velocidad >= 10)
                velocidad = velocidad - 10;
        }
    }
    public int getVelocidad() {
        return velocidad;
    }
    public boolean isEstaEncendido() {
        return estaEncendido;
    }
    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
   
}
