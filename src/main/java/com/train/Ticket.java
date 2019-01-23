package com.train;

public class Ticket {
    int totalTickets;
    int roundTrip;
    int Total;

    public int cost(){
        Total=roundTrip*1800+(totalTickets-roundTrip)*1000;
        return Total;
    }

    public Ticket(int totalTickets, int roundTrip) {
        this.totalTickets = totalTickets;
        this.roundTrip = roundTrip;
    }
}
