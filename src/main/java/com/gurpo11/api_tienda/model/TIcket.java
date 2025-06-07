package com.gurpo11.api_tienda.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TD_TICKET")

public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "SEQ_CARRO_ID", allocationSize = 1)
    @Column(name = "TICKET_ID")
    private Long ticketId;
    @Column(name = "TOTAL")
    private Long total;
    @Column(name = "REGISTRO_FECHA")
    private Date registroFecha;

    public Ticket() {
    }

    public Ticket(Long ticketId, Long total, Date registroFecha) {
        this.ticketId = ticketId;
        this.total = total;
        this.registroFecha = registroFecha;
    }

    public Long getTicketId() {
        return ticketId;
    }
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public Date getRegistroFecha() {
        return registroFecha;
    }
    public void setRegistroFecha(Date registroFecha) {
        this.registroFecha = registroFecha;
    }


}
