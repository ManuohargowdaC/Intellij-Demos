package com.Threds.Basic;
//class A implements Runnable{
//    @Override
//    public void run(){
//        System.out.println("Great");
//    }
//}
//
//interface Runnable {
//    public void run();
//}
    public class Demo {
        public static void main(String[] args) {
            Runnable task = ()->{
                System.out.println("Task 1");
            };

            Thread t1 = new Thread(task,"pop");
            Thread t2 = new Thread(()->{
                System.out.println("Task 2");
            },"top");
            t1.start();
            t2.start();
        }
    }

