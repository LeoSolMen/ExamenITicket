/*
Clase entidad eventos para examen ITicket
 */
package com.ITicket.ITicket.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LeoSolis
 */
@Entity
@Table (name="eventos")
public class Eventos implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int idEvento;
    private String artista;
    private java.sql.Date fechaconcierto;
    private int costoevento;
    private int capacidadMax;
    private String lugarconcierto;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Date getFechaconcierto() {
        return fechaconcierto;
    }

    public void setFechaconcierto(Date fechaconcierto) {
        this.fechaconcierto = fechaconcierto;
    }

    public int getCostoevento() {
        return costoevento;
    }

    public void setCostoevento(int costoevento) {
        this.costoevento = costoevento;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public String getLugarconcierto() {
        return lugarconcierto;
    }

    public void setLugarconcierto(String lugarconcierto) {
        this.lugarconcierto = lugarconcierto;
    }       
}
