package com.api.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Tony",10,"ISE");
        try (
            FileOutputStream fileOutputStream = new FileOutputStream("stud.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ){
            objectOutputStream.writeObject(student1);
            System.out.println("completed");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
