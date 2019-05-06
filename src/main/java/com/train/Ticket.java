package com.train;

public class Ticket {
    int ticket;
    int round;
    int oneWayPrice = 1000;
    int rountTripPrice = 2000;

    public Ticket(int ticket, int round) {
        this.ticket = ticket;
        this.round = round;
    }


    public int getSum() {
        Double total = 0.0;
        if (round >= ticket ) {
            total = (ticket * rountTripPrice) * 0.9 ;
        }
        else {
            int oneWayCount = ticket - round;
            total = (oneWayCount * oneWayPrice) + ((round * rountTripPrice) * 0.9);
        }
        return total.intValue();
    }
}
