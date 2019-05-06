package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets:");
        int ticketCount = scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        int roundTripcount = scanner.nextInt();

        Ticket ticket = new Ticket(ticketCount,roundTripcount);
        System.out.println("Total Tickets: " + ticketCount + "\n" + "Round-trip: " + roundTripcount + "\n" + "Total: " + ticket.getSum());
    }
}
