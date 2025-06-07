package com.gurpo11.api_tienda.service;

import java.util.List;
import java.util.Optional;

import com.gurpo11.api_tienda.model.Ticket;
import com.gurpo11.api_tienda.model.TicketOut;

public interface TicketService {

    public List<Ticket> getAllTickets();
    public Optional<Ticket> getTicketById(Long id);
    public Ticket createTicket(Ticket ticket);
    public Ticket updateTicket(Long id, Ticket ticket);
    void deleteTicket(Long id);
    public Long getTicketId();

}
