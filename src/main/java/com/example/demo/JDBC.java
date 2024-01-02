package main.java.com.example.demo;

import java.sql.*;
import java.util.Scanner;

public class JDBC {

    public static void main(String[] args) {
       
        Scanner obj=new Scanner(System.in);
        System.out.println("choose one option:1.register 2.login");
        String option=obj.nextLine();
        System.out.println("enter userName:");
        String userName=obj.nextLine();
        System.out.println("enter password:");
        String password=obj.nextLine();
        if("1".equals(option)){
            System.out.println("enter email:");
            String eamil=obj.nextLine();
            String query="INSERT INTO user_data (username, password, email) " +
                    "VALUES ('"+userName+"', '"+password+"', '"+eamil+"')";
            User user = extracted(query, "1");
            if(user!=null){
                System.out.println("register successfully!");
            }
        }
        if("2".equals(option)){
            String query="select * from user_data where username='"+userName+"'";
            User user = extracted(query, "2");
            if(user!=null && !user.password.isEmpty()){
                if(user.name.equals(userName) && user.password.equals(password)){
                    System.out.println("login in successfully as "+userName);
                    System.out.println("choose one option:1.change to a student");
                    System.out.println("enter studentId:");
                    String studentId=obj.nextLine();
                    System.out.println("enter address:");
                    String address=obj.nextLine();
                    String insert="Insert into STUDENTS_297 (STUDENTID,NAME,ADDRESS) values " +
                            "('"+studentId+"','"+userName+"','"+address+"')";
                    extracted(insert, "1");
                    System.out.println("change to a student successfully");

                }else {
                    System.out.println("login in failed as "+userName);
                }
            }else {
                System.out.println("login in failed as "+userName);
            }
        }

    }

    private static User extracted(String sqlQuery,String option) {
        // JDBC URL, username, and password of Oracle database
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "fuchun";
        String password = "fuchun";
        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            if (connection != null) {
                System.out.println("Connected to the Oracle database!");
                // Create a PreparedStatement
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sqlQuery);
                if(!"1".equals(option)){
                    while (resultSet.next()){
                        String column1Value = resultSet.getString("username");
                        String column2Value = resultSet.getString("password");
                        User user=new User(column1Value,column2Value);
                        return user;
                    }
                }
                // Close the connection when done
                connection.close();
                System.out.println("Connection closed.");

            } else {
                System.out.println("Failed to connect to the Oracle database!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
