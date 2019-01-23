package com.train;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("請輸入需購買張數:");
        int totalTicket=scanner.nextInt();
        System.out.println("請輸入來回票張數:");
        int roundTrip=scanner.nextInt();
        Ticket tic=new Ticket(totalTicket,roundTrip);

        System.out.println("Total tickets:"+tic.totalTickets+"\n Round-trip:"+tic.roundTrip+
                "\n Total:"+tic.cost());
    }


}
