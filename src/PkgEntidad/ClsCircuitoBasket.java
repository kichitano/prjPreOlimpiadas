/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgEntidad;

/**
 *
 * @author Vera
 */
public class ClsCircuitoBasket {
    int idEquipo;
    int puntajeEquipo;
    String posicionEquipo;
    
    public ClsCircuitoBasket() {
    }

    public ClsCircuitoBasket(int idEquipo, int puntajeEquipo, String posicionEquipo) {
        this.idEquipo = idEquipo;
        this.puntajeEquipo = puntajeEquipo;
        this.posicionEquipo = posicionEquipo;
    }
    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }

    public String getPosicionEquipo() {
        return posicionEquipo;
    }

    public void setPosicionEquipo(String posicionEquipo) {
        this.posicionEquipo = posicionEquipo;
    }
}