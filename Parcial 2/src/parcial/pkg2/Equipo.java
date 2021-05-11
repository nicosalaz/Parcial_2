 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg2;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Equipo implements Estadisticas {
    private String nombreEquipo;
    private int cantJgadores;
    ArrayList<Jugador> listajugadores = new ArrayList<Jugador>();
    private Persona entrenador;
    private int cantidadEnfrentamientosDisputados;
    private int cantidadTorneosDisputados;
    private int cantidadEnfrentamientosGanados;
    private int cantidadTorneosGanados;
    ArrayList<Torneo> listaTorneo = new ArrayList<Torneo>();
    private String pais;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getCantJgadores() {
        return cantJgadores;
    }

    public Persona getEntrenador() {
        return entrenador;
    }

    public int getCantidadEnfrentamientosDisputados() {
        return cantidadEnfrentamientosDisputados;
    }

    public int getCantidadTorneosDisputados() {
        return cantidadTorneosDisputados;
    }

    public int getCantidadEnfrentamientosGanados() {
        return cantidadEnfrentamientosGanados;
    }

    public int getCantidadTorneosGanados() {
        return cantidadTorneosGanados;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setCantJgadores(int cantJgadores) {
        this.cantJgadores = cantJgadores;
    }

    public void setEntrenador(Persona entrenador) {
        this.entrenador = entrenador;
    }

    public void setCantidadEnfrentamientosDisputados(int cantidadEnfrentamientosDisputados) {
        this.cantidadEnfrentamientosDisputados = cantidadEnfrentamientosDisputados;
    }

    public void setCantidadTorneosDisputados(int cantidadTorneosDisputados) {
        this.cantidadTorneosDisputados = cantidadTorneosDisputados;
    }

    public void setCantidadEnfrentamientosGanados(int cantidadEnfrentamientosGanados) {
        this.cantidadEnfrentamientosGanados = cantidadEnfrentamientosGanados;
    }

    public void setCantidadTorneosGanados(int cantidadTorneosGanados) {
        this.cantidadTorneosGanados = cantidadTorneosGanados;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public Equipo(String nombreEquipo, int cantJgadores, Persona entrenador, int cantidadEnfrentamientosDisputados, int cantidadTorneosDisputados, int cantidadEnfrentamientosGanados, int cantidadTorneosGanados, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.cantJgadores = cantJgadores;
        this.entrenador = entrenador;
        this.cantidadEnfrentamientosDisputados = cantidadEnfrentamientosDisputados;
        this.cantidadTorneosDisputados = cantidadTorneosDisputados;
        this.cantidadEnfrentamientosGanados = cantidadEnfrentamientosGanados;
        this.cantidadTorneosGanados = cantidadTorneosGanados;
        this.pais = pais;
    }
    
    void crearListaJugadores(Jugador j)
    {
        this.listajugadores.add(j);
    }
    void imprimirListaJugadores()
    {
        for (int i = 0; i < this.listajugadores.size(); i++) {
            System.out.println((i+1)+" "+this.listajugadores.get(i));
        }
    }
    @Override
    public double porcentajeTGanados()
    {
        double result = (this.getCantidadTorneosGanados()*100)/(this.getCantidadTorneosDisputados());
        return result;
    }
    @Override
    public double porcentajeTPerdidos()
    {
        double result = (((this.getCantidadTorneosDisputados())-(this.getCantidadTorneosGanados()))*100)/(this.getCantidadTorneosDisputados());
        return result;
    }
    @Override
    public double porcentajeEfectividad()
    {
        double result = (this.getCantidadEnfrentamientosGanados()*100)/(this.getCantidadEnfrentamientosDisputados());
        return result;
    }
    void crearEntrenador(Persona p)
    {
        this.entrenador = p;
    }
    
    void crearListaTorneos(Torneo t)
    {
        this.listaTorneo.add(t);
    }
    void imprimirTorneos()
    {
        for (int i = 0; i < this.listaTorneo.size(); i++) {
            System.out.println((i+1)+" "+this.listaTorneo.get(i));
        }
    }

    @Override
    public String toString() {
        return "nombreEquipo = "+ nombreEquipo + "\n cantJgadores = " + cantJgadores + "\n" + " cantidadEnfrentamientosDisputados = " + cantidadEnfrentamientosDisputados + "\n cantidadTorneosDisputados = " + cantidadTorneosDisputados + "\n cantidadEnfrentamientosGanados = " + cantidadEnfrentamientosGanados+"\n cantidadEnfrentamientosPerdidos = "+(cantidadEnfrentamientosDisputados-cantidadEnfrentamientosGanados) + "\n cantidadTorneosGanados = " + cantidadTorneosGanados + "\n pais=" + pais +"\n"+" entrenador=" + entrenador ;
    }
    
    
}
