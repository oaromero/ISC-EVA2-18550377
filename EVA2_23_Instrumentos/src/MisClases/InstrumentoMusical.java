/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Oscar Aron Romero Camacho
 */
   abstract public class InstrumentoMusical {
       // el atributo y sus metodos get y set 
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     //Método abstracto que se hereda de forma obligatoria a las demás clases que heredan de esta
    abstract public void tocarInstrumento();
}
