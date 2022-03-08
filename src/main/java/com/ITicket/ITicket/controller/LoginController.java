/*
Clase login controller para examen ITicket
 */
package com.ITicket.ITicket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String index()
    {
        return "home";
    }
}