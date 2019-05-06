package com.train

import java.util.*

fun main(args: Array<String>) {

//    val scanner = Scanner(System.`in`)
    var ticketCount = 0

    while (ticketCount != -1) {
        print("Please enter number of tickets:")
        ticketCount = readLine()!!.toInt() //scanner.nextInt()
        if (ticketCount == -1) {
           println("Exit")
        }
        else {
            print("How many round-trip tickets:")
            val roundTrip = readLine()!!.toInt()//scanner.nextInt()

            val ticket = TicketKotlin(ticketCount,roundTrip)

            println("Total Tickets: $ticketCount \n Round-trip: $roundTrip \n Total: ${ticket.getSum()}")

        }

    }

}

class TicketKotlin(var ticket: Int, var round: Int) {
    val oneWayPrice = 1000
    val roundtripPrice = 2000
    var oneWayCount = ticket - round

    fun getSum() : Int {
        var total: Double = 0.0
        if (round >= ticket) {
            total = ticket * roundtripPrice * 0.9
        }
        else {
            total = (oneWayCount * oneWayPrice) + (round * roundtripPrice * 0.9)

        }
        return total.toInt()
    }

}