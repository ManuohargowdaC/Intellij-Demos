package com.jdbc.basics;

import java.sql.*;

public class SelectTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String userName = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);


            Statement statement = connection.createStatement();

            String sql = "select * from employee";
            ResultSet resultSet= statement.executeQuery(sql);
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int employeeId = resultSet.getInt("employeId");
                String city = resultSet.getString("city");
                System.out.println(name+ "\t"+employeeId+ "\t"+city);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
