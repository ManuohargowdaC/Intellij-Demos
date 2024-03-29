package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";

        String sql = "update cab set driver_name=? where cab_number=?";

        try (
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            Scanner scanner = new Scanner(System.in);
            int cab_number = scanner.nextInt();

            String driverName = scanner.next();

            statement.setInt(2, cab_number);
            statement.setString(1, driverName);
            boolean result = statement.execute();
            System.out.println(result);
        }

     catch (Exception e) {
         e.printStackTrace();
     }

    }
}
