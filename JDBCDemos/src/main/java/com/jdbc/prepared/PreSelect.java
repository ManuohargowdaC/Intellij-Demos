package com.jdbc.prepared;

import java.sql.*;

public class PreSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);


            Statement statement = connection.createStatement();

            String sql = "select * from cab";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String dropLoc = resultSet.getString("drop_loc");
                int cabNumber = resultSet.getInt("cab_number");
                String pickup = resultSet.getString("pickup");
                String driverName = resultSet.getString("driver_name");
                Time time= resultSet.getTime("pickup_time");
                Date date= resultSet.getDate("pickup_date");
                System.out.println(dropLoc + "\t" + cabNumber + "\t" + pickup + "\t" + driverName);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
