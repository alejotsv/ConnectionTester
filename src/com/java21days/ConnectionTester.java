package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionTester extends JFrame {
    Dimension dim = new Dimension(250, 120);
    String text = "Checking connection...";

    ConnectionTester(String url){
        super("Testing connection");
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel label = new JLabel(text);
        add(label);
        try {
            URL page = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) page.openConnection();

        } catch (MalformedURLException e){
            System.out.println("Malformed URL Exception: " + e.getMessage());
        } catch (IOException e){
            System.out.println("I/O Exception: " + e.getMessage());
        }

        setVisible(true);
    }

}
