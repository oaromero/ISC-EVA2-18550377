/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Oscar aron romero camacho 
 */
// se crea la clase rectangulo deriva de la clase figura geometrica 
public class Rectangulo extends FiguraGeometrica {
    // se craen los atributos y sus metodos get y set
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
     public int calcularArea(){
        return (base*altura);
    }
    
}
