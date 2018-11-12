/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Polimorfismo
        // Padre = new Hijo --> esta bien
        //Hijo = new Padre --> no esta bien
        
        Persona pPer = new Alumno();
        pPer.setNombre("Oscar");
        pPer.setApellido("Romero");
        //Casting
        Alumno aAlumno = (Alumno) pPer;       
        aAlumno.getNumControl();
        System.out.println(aAlumno.getNombre());
        System.out.println(aAlumno.getApellido());
        System.out.println(aAlumno.getNumControl());
    }
    
}
class Alumno extends Persona{
    private String NumControl;
    
    public Alumno(){
        NumControl = "18550377";
    }

    public String getNumControl() {
        return NumControl;
    }

    public void setNumControl(String NumControl) {
        this.NumControl = NumControl;
    }
    
}
class Empleado extends Persona{
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
}
class Persona{
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
