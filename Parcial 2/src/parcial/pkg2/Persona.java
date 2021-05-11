/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;

/**
 *
 * @author aleja
 */
public class Persona {
    private String nombre;
    private String identificacion;
    private int edad;
    private String nacionalidad;  

    public Persona(String nombre, String identificacion, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", edad=" + edad + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
}


