package com.Threads.concorrency;

import com.Threds.Basic.Booking;
import com.Threds.Basic.DashBoard;
import com.Threds.Basic.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> {
            System.out.println("Doing Polling");
            Greetings greetings = new Greetings();
            greetings.sayHello("manu");
        });
        executorService.execute(()->{
            System.out.println("Reading from URL");
            Booking booking = new Booking();
            System.out.println(booking.bookTicket("Shrii",20));
        });
        executorService.execute(()->{
            System.out.println(" Reading from DB");
        });
    }
}
