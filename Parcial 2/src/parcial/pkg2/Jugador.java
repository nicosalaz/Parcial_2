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
public class Jugador extends Persona{
    private String apodoJugador;
    private String rollJugador;

    public Jugador(String apodoJugador, String rollJugador, String nombre, String identificacion, int edad, String nacionalidad) {
        super(nombre, identificacion, edad, nacionalidad);
        this.apodoJugador = apodoJugador;
        this.rollJugador = rollJugador;
    }

    

    public String getApodoJugador() {
        return apodoJugador;
    }

    public void setApodoJugador(String apodoJugador) {
        this.apodoJugador = apodoJugador;
    }

    public void setRollJugador(String rollJugador) {
        this.rollJugador = rollJugador;
    }

    public String getRollJugador() {
        return rollJugador;
    }

    @Override
    public String toString() {
        return "Jugador{" + "apodoJugador=" + apodoJugador + ", rollJugador=" + rollJugador + '}';
    }
}
