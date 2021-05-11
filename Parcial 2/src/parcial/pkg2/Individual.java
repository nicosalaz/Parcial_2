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
public class Individual implements Estadisticas{
    private String nombreEquipo;
    private Persona entrenador;
    private int cantidadEnfrentamientosDisputados;
    private int cantidadTorneosDisputados;
    private int cantidadEnfrentamientosGanados;
    private int cantidadTorneosGanados;
    ArrayList<Torneo> listaTorneo;

    public Individual(String nombreEquipo, Persona entrenador, int cantidadEnfrentamientosDisputados, int cantidadTorneosDisputados, int cantidadEnfrentamientosGanados, int cantidadTorneosGanados) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = entrenador;
        this.cantidadEnfrentamientosDisputados = cantidadEnfrentamientosDisputados;
        this.cantidadTorneosDisputados = cantidadTorneosDisputados;
        this.cantidadEnfrentamientosGanados = cantidadEnfrentamientosGanados;
        this.cantidadTorneosGanados = cantidadTorneosGanados;
        this.listaTorneo = new ArrayList<Torneo>();
    }
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public Persona getEntrenador() {
        return entrenador;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
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
        double efectividad = (this.getCantidadEnfrentamientosGanados()*100)/(this.getCantidadEnfrentamientosDisputados());
        return efectividad;
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
        return "nombreEquipo = " + nombreEquipo + "\n entrenador=" + entrenador 
                + "\n cantidadEnfrentamientosDisputados = " + cantidadEnfrentamientosDisputados 
                + "\n cantidadTorneosDisputados = " + cantidadTorneosDisputados 
                + "\n cantidadEnfrentamientosGanados=" + cantidadEnfrentamientosGanados 
                +"\n cantidadEnfrentamientosPerdidos = "+(cantidadEnfrentamientosDisputados-cantidadEnfrentamientosGanados) 
                + "\n cantidadTorneosGanados=" + cantidadTorneosGanados ;
    }
    
}
