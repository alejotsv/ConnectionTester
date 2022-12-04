package com.java21days;

import javax.swing.*;
import java.awt.*;

public class ConnectionTester extends JFrame {
    Dimension dim = new Dimension(250, 120);

    ConnectionTester(String url){
        super("Testing connection");
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

}
