package main.java.com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab1121 {
    private static final String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String username = "fuchun";
    private static final String password = "fuchun";

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Database Panel Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel
        JPanel panel = new JPanel();

        // Add components to the panel
        JLabel label = new JLabel("Hello, Database Panel!");
        panel.add(label);

        // Create a button
        JButton getDataButton = new JButton("Get Data");
        panel.add(getDataButton);

        // Add action listener to the button
        getDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button click event (retrieve data from the database)
                retrieveDataFromDatabase();
            }
        });



        // Add the panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }

    // Method to retrieve data from the database
    private static void retrieveDataFromDatabase() {
        try {
            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query (replace this with your actual query)
            String query = "select * from user_data";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the results (replace this with your logic)
            while (resultSet.next()) {
                // Retrieve data from the result set
                String data = resultSet.getString("username");
                System.out.println("Retrieved data: " + data);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
