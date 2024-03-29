package com.Threds.Basic;

class Runner implements Runnable{

    String name;
    Greetings greetings;
    public Runner(String name, Greetings greetings){
        Thread t = new Thread(this,name);
        this.name=name;
        this.greetings=greetings;
        t.start();
    }

    @Override
    public void run(){
        synchronized (greetings) {
            System.out.println(greetings.sayHello(name));
            System.out.println("done");
        }

    }

}

public class RunnerThread {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        Runner runner1 = new Runner("Ram",greetings);
        Runner runner2 = new Runner("Tom",greetings);
        Runner runner3 = new Runner("Sam",greetings);
        Runner runner4 = new Runner("John",greetings);



//        Thread thread1 = new Thread(runner,"Thread 1");
//        Thread thread2 = new Thread(runner,"Thread 2");


 //       thread1.start();
    }
}
