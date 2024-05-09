package Repositories;

import Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    Map<String, Ticket> ticketTable = new HashMap<String, Ticket>();

    public Map<String,Ticket> getTicketMap(String ticketId){
        return ticketTable;
    }

    public void setTicketTable(Map<String, Ticket> ticketMap){
        ticketTable=ticketMap;
    }

    public Map<String, Ticket> getTicketTable() {
        return ticketTable;
    }

    public Ticket createTicket(Ticket ticket){
        ticketTable.put(ticket.getTicketNumber(),ticket);
        return ticket;
    }


}
