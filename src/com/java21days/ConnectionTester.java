package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionTester extends JFrame {
    Dimension dim = new Dimension(550, 120);
    String text = "Checking connection...";

    ConnectionTester(String url){
        super("Testing connection");
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        try {
            URL page = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) page.openConnection();
            String  response = connection.getResponseMessage();
            text = response;
            InputStreamReader in = new InputStreamReader((InputStream) connection.getContent());
            BufferedReader buffer = new BufferedReader(in);

        } catch (MalformedURLException e){
            System.out.println("Malformed URL Exception: " + e.getMessage());
        } catch (IOException e){
            System.out.println("I/O Exception: " + e.getMessage());
            text = e.getMessage();
        }

        JLabel label = new JLabel(text);
        add(label);
        setVisible(true);
    }

}
