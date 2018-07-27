package com.pqanh95.gamebox;

import javax.swing.*;
import java.awt.*;

public class LuckyBox extends JFrame implements Common {
    public LuckyBox() {
        setTitle("My first game");
        add(new MainBoard());
        setSize(Common.WIDTH, Common.HEIGHT);
        setResizable(false); // không cho thay đổi kích thước của frame
        setLocationRelativeTo(null); // thiết lập cửa sổ nằm ở giữa màn hình
        setDefaultCloseOperation(EXIT_ON_CLOSE); // thiết lập khi đóng chương trình
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LuckyBox().setVisible(true);
            }
        });
    }

}
