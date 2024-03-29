package com.api.serial;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("demo.txt");
            fileWriter = new FileWriter("trial.txt");
            int num = fileReader.read();
            fileWriter.write((char)num);
            do {
                num = fileReader.read();
                fileWriter.write((char)num);
            }while (num!=-1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter!=null)
                    fileWriter.close();
                if (fileReader!=null)
                    fileReader.close();

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
