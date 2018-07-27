package com.game.mario;

import javax.swing.*;

public class PlayGame extends JFrame {
    public PlayGame(){
        setSize(1000,500);
        setTitle("Game Mario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        add(new GameScreen());
    }
    public static void main(String[] args) {
        new PlayGame().setVisible(true);
    }
}
