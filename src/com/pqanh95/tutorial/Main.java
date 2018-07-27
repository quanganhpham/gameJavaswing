package com.pqanh95.tutorial;

import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Demo 1");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new LoadImage());
    }

    public static void main(String[] args) {
        new Main().setVisible(true);

    }
}
