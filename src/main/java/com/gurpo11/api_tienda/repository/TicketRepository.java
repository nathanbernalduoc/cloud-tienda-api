package com.gurpo11.api_tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gurpo11.api_tienda.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

    @Query(value = "SELECT SEQ_TICKET_ID.nextval from DUAL", nativeQuery = true)
    public Long getTicketId();
}
