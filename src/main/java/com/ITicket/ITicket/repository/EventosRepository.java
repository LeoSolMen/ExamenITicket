/*
Repositorio eventos para examen ITicket
 */
package com.ITicket.ITicket.repository;

import com.ITicket.ITicket.entity.Eventos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LeoSolis
 */
@Repository
public interface EventosRepository extends CrudRepository<Eventos, Long>{
    
}
