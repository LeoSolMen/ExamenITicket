/*
Clase Eventos controller para examen ITicket
 */
package com.ITicket.ITicket.controller;

import com.ITicket.ITicket.entity.Eventos;
import com.ITicket.ITicket.service.IEventosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author LeoSolis
 */
@Controller
public class EventosController {
@Autowired
    private IEventosService EventosService;

    @GetMapping("/eventos")
    public String index(Model model) {
        List<Eventos> listadoEventos = EventosService.getAllEventos();
        System.out.print(listadoEventos);
        model.addAttribute("titulo", "Eventos");
        model.addAttribute("eventos", listadoEventos);
        return "eventos";
    }

    @GetMapping("/NuevoEvento")
    public String crearEvento(Model model) {
        model.addAttribute("eventos", new Eventos());
        return "EventoNuevo";
    }

    @PostMapping("/saveEventos")
    public String guardarEvento(@ModelAttribute Eventos evento) {
        EventosService.saveEventos(evento);
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String eliminarEvento(@PathVariable("id") Long idEvento) {
        EventosService.delete(idEvento);
        return "redirect:/TodosEventos";
    }
}
