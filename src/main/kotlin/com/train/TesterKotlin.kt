package com.train

import java.util.*

fun main(args: Array<String>) {
 val scanner = Scanner(System.`in`)
        println("請輸入需購買張數:")
        val totalTicket = scanner.nextInt()
        println("請輸入來回票張數:")
        val roundTrip = scanner.nextInt()
        val tic = TicketKotlin(totalTicket, roundTrip)

        println(
            "Total tickets:" + tic.totalTickets + "\n Round-trip:" + tic.roundTrip +
    "\n Total:" + tic.cost()
        )
}

class TicketKotlin(totalTickets : Int,roundTrip : Int){

    var totalTickets=totalTickets;
    var roundTrip=roundTrip;
    fun cost(): Int{
        var Total = roundTrip * 1800 + (totalTickets - roundTrip) * 1000
        return Total
    }

}