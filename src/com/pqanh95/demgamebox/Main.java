package com.pqanh95.demgamebox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame implements Common1 {
    private WindowAdapter windowAdapter;
    public Main(){
        setTitle("Game Moved!");
        add(new MainBoard());
        setSize(WIDTH_FRAME, HEIGHT_FRAME);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        // lắng nghe sự kiện thoát cửa sổ
        windowAdapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int i = JOptionPane.showConfirmDialog(Main.this,"Bạn có muốn thoát không?","Game Moved",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if (i==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        };
        addWindowListener(windowAdapter);
    }
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
