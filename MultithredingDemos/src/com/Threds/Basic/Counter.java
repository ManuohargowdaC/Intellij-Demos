package com.Threds.Basic;

public class Counter implements Runnable{
    String name;
    int noOfTickets;
    Booking booking;


    public Counter(String name, int noOfTickets,Booking booking) {
        super();
        this.name = name;
        this.noOfTickets = noOfTickets;
        this.booking = booking;
        Thread t = new Thread(this,name);
        t.start();
    }
    @Override
    public void run(){
        synchronized (booking) {
            System.out.println("Welcome to ABC Threats " + name);
            double amount = booking.bookTicket(name, noOfTickets);
            System.out.println("Amount to be paid " + amount);
        }
    }
}
