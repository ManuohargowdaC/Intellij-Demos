package com.jdbc.prepared;

import java.sql.*;
import java.util.Scanner;

public class SelectWhere {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";

        String sql = "select driver_name from cab where cab_number=?";

        try (
                Connection connection = DriverManager.getConnection(url, userName, password);
                PreparedStatement statement = connection.prepareStatement(sql);
               ResultSet resultSet = statement.executeQuery();
        ) {
            while (resultSet.next()) {
                Scanner scanner = new Scanner(System.in);
                int cab_number = scanner.nextInt();


                statement.setInt(1, cab_number);

                String dropLoc = resultSet.getString("drop_loc");
                int cabNumber = resultSet.getInt("cab_number");
                String pickup = resultSet.getString("pickup");
                Time time= resultSet.getTime("pickup_time");
                Date date= resultSet.getDate("pickup_date");
                String driverName=resultSet.getString("driver_name");
                System.out.println(dropLoc + "\t" + cabNumber + "\t" + pickup + "\t" + driverName+"\t"+time+"\t"+date);

                boolean result = statement.execute();
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
