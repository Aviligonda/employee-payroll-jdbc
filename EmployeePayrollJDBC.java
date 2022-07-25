package com.bridzelab;

import java.sql.*;

public class EmployeePayrollJDBC {
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to Employee Payroll program on JDBC");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "Sravani@6086");
            System.out.println("Connection done.....");
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO employee_payroll VALUES (5,'John','8919584625','BKS','Sales','M',100000.00,20000.00,80000.00,92000.00,8000.00,'2021-03-01')");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee_payroll");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1)
                        + " " + resultSet.getString(2)
                        + " " + resultSet.getString(3)
                        + " " + resultSet.getString(4)
                        + " " + resultSet.getString(5)
                        + " " + resultSet.getString(6)
                        + " " + resultSet.getDouble(7)
                        + " " + resultSet.getDouble(8)
                        + " " + resultSet.getDouble(9)
                        + " " + resultSet.getDouble(10)
                        + " " + resultSet.getDouble(11)
                        + " " + resultSet.getDate(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}
