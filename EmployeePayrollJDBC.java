package com.bridzelab;

import java.sql.*;

public class EmployeePayrollJDBC {
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to Employee Payroll program on JDBC");
        double BasicPay = 4000000.00;
        int id = 1;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "Sravani@6086");
            System.out.println("Connection done.....");
            String sql = "UPDATE employee_payroll SET BasicPay=? WHERE id= ?";
            PreparedStatement statement1 = connection.prepareStatement(sql);
            statement1.setDouble(1, BasicPay);
            statement1.setInt(2, id);
            statement1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}
