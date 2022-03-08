/*
Interface Eventos Service para examen ITicket
 */
package com.ITicket.ITicket.service;

import com.ITicket.ITicket.entity.Eventos;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LeoSolis
 */
@Repository
public interface IEventosService {
    public List<Eventos> getAllEventos();
    public void saveEventos(Eventos evento);
    public Eventos getEventosById(long id);
    public void delete(long id);
}
