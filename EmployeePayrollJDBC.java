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
            ResultSet resultSet = statement.executeQuery("SELECT SUM(BasicPay) FROM employee_payroll WHERE gender = 'M' GROUP BY gender ");
            while (resultSet.next()) {
                System.out.println("Sum of the all Basic salary " + resultSet.getDouble("SUM(BasicPay)"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}
