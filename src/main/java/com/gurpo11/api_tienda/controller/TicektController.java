package com.gurpo11.api_tienda.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gurpo11.api_tienda.model.TicketOut;
import com.gurpo11.api_tienda.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicektController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket/gen")
    public TicketOut getTicketId() {
        Long ticketId = ticketService.getTicketId();
        TicketOut ticketOut = new TicketOut(ticketId);
        return ticketOut;
    }
    

}
