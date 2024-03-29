package com.Threds.Basic;

public class DashBoard {
    public static void main(String[] args) {
        Booking booking = new Booking();
        Counter counter1 = new Counter("Tom",10,booking);
        Counter counter2 = new Counter("Sam",18,booking);
        Counter counter3 = new Counter("John",15,booking);

    }
}
