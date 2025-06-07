package com.gurpo11.api_tienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurpo11.api_tienda.model.Ticket;
import com.gurpo11.api_tienda.model.TicketOut;
import com.gurpo11.api_tienda.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    public TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> getTicketById(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
    
    @Override
    public Ticket updateTicket(Long id, Ticket ticket) {
        if (ticketRepository.existsById(id)) {
            ticket.setTicketId(id);
            return ticketRepository.save(ticket);
        } else {
            return null;
        }
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public Long getTicketId() {
        return ticketRepository.getTicketId();
    }
}
