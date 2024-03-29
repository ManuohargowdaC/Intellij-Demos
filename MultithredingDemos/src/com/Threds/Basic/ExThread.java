package com.Threds.Basic;

class Child extends Thread{

    public Child(String name,int priority){
        super(name);
        System.out.println(this);
        this.start();


    }


    @Override
    public void run(){

        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println(i+"x"+i+"="+(i*5));
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e ){
                e.printStackTrace();
            }

        }

    }
}
public class ExThread {
    public static void main(String[] args) {
        Child child1 = new Child("child one",10);
//        child1.setName("thread-one");
//        System.out.println(child1);
//        child1.start();
        Child child2 = new Child("child two",6);
//        child2.setName("thread-one");
//        System.out.println(child2);
//        child2.start();
        Child child3= new Child("child three",8);

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i + "x" + i + "=" + (i * 5));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }try {
            child1.join();
            child2.join();
            child2.setDaemon(true);

            child3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }

}
