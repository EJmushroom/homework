package com.train

import java.util.*

fun main(args: Array<String>) {
        var totalTicket=0
        val scanner = Scanner(System.`in`)
    while (totalTicket!=-1) {
        println("請輸入需購買張數:")
        totalTicket = scanner.nextInt()
        if (totalTicket==-1)
            break

        println("請輸入來回票張數:")
        val roundTrip = scanner.nextInt()
        val tic = TicketKotlin(totalTicket, roundTrip)

        println("Total tickets:"+tic.totalTickets+ "\n Round-trip:" +tic.roundTrip+" \n Total:"+tic.cost())
    }
}

class TicketKotlin(totalTickets : Int,roundTrip : Int){

    var totalTickets=totalTickets
    var roundTrip=roundTrip
    fun cost()=roundTrip * 1800 + (totalTickets - roundTrip) * 1000

}