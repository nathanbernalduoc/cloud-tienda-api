package com.gurpo11.api_tienda.model;

public class TicketOut {

    private Long ticketId;

    public TicketOut(Long ticketId) {
        this.ticketId = ticketId;
    }

    TicketOut() {}

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

}
