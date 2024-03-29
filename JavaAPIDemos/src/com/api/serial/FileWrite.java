package com.api.serial;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) {


        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("demo.txt");
            char C = (char) bufferedReader.read();
            while (C != 'q') {
                System.out.print(C);
                C = (char)bufferedReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {

            fileOutputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
