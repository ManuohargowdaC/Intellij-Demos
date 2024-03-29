package com.api.serial;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResorces {
    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("demo.txt");
            FileWriter fileWriter = new FileWriter("trial.txt");
            ) {
            int num = fileReader.read();
            fileWriter.write((char)num);
            do {
                num = fileReader.read();
                fileWriter.write((char)num);
            }while (num!=-1);
        }catch (Exception e){
            e.printStackTrace();
        }
//        finally {
//            try {
//                if (fileWriter!=null)
//                    fileWriter.close();
//                if (fileReader!=null)
//                    fileReader.close();

      //      }catch (IOException e){
           //     e.printStackTrace();
            }
        }
      //  }catch (Exception e)




