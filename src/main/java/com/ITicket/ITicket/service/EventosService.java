/*
Clase Eventos Service para examen ITicket
 */
package com.ITicket.ITicket.service;

import com.ITicket.ITicket.entity.Eventos;
import com.ITicket.ITicket.repository.EventosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LeoSolis
 */

@Service
public class EventosService implements IEventosService{
    
     //Dependencias
    @Autowired
    private EventosRepository EventosRepository;
    
    @Override
    public List<Eventos> getAllEventos() {
        return (List<Eventos>)EventosRepository.findAll();
    }

    @Override
    public void saveEventos(Eventos evento) {
        EventosRepository.save(evento);
    }

    @Override
    public Eventos getEventosById(long id) {
       return EventosRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        EventosRepository.deleteById(id);
    }
}
