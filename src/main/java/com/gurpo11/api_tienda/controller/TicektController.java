package com.gurpo11.api_tienda.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.gurpo11.api_tienda.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicektController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket/gen")
    public Long getTicketId() {
        return ticketService.getTicketId();
    }
    

}
