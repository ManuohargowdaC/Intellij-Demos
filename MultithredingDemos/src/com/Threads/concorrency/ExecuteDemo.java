package com.Threads.concorrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i=1;i<=10;i++) {
            executorService.execute(() -> {
                System.out.println("Doing Task");
            });
        }
            executorService.shutdown();
        }
    }



