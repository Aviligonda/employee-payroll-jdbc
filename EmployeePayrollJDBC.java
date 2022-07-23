package com.bridzelab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollJDBC {
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to Employee Payroll program on JDBC");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "Sravani@6086");
            System.out.println("Connection done.....");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}
