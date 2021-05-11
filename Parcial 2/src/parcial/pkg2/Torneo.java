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
public class Torneo {
    
    private String nombreTorneo;
    private String fechaTorneo;
    private String puestoOcupado;
    private String TipoJuego;

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public void setFechaTorneo(String fechaTorneo) {
        this.fechaTorneo = fechaTorneo;
    }

    public void setPuestoOcupado(String puestoOcupado) {
        this.puestoOcupado = puestoOcupado;
    }

    public void setTipoJuego(String TipoJuego) {
        this.TipoJuego = TipoJuego;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public String getFechaTorneo() {
        return fechaTorneo;
    }

    public String getPuestoOcupado() {
        return puestoOcupado;
    }

    public String getTipoJuego() {
        return TipoJuego;
    }


    public Torneo(String nombreTorneo, String fechaTorneo, String puestoOcupado, String TipoJuego) {
        this.nombreTorneo = nombreTorneo;
        this.fechaTorneo = fechaTorneo;
        this.puestoOcupado = puestoOcupado;
        this.TipoJuego = TipoJuego;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombreTorneo=" + nombreTorneo + ", fechaTorneo=" + fechaTorneo + ", puestoOcupado=" + puestoOcupado + ", TipoJuego=" + TipoJuego + '}';
    }
    
}
