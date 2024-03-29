package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";

        String sql = "insert into cab values(?,?,?,?,?,?)";
        try (
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                int cab_number = scanner.nextInt();
                String dropLoc = scanner.next();
                String pickup = scanner.next();
                String driverName = scanner.next();
                String date = scanner.next();
                String time = scanner.next();


                statement.setInt(1, cab_number);
                statement.setString(2, dropLoc);
                statement.setString(3, pickup);
                statement.setTime(4, Time.valueOf(time));
                statement.setDate(5, Date.valueOf(date));
                statement.setString(6, driverName);

                boolean result = statement.execute();
                System.out.println(result);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}





