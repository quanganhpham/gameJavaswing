package com.anhpq95.ransanmoi;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel implements Runnable {
    Thread thread;

    Snake snake = new Snake();
    VienDan vienDan = new VienDan();
    QuanDich quanDich = new QuanDich(4, 12);
    Title title = new Title();
    MyTank myTank = new MyTank(200,100,200,92);

    DichLevel1 dichLevel1 = new DichLevel1(200,200);

    MyPlanes myPlanes = new MyPlanes(250,250);

    public GameScreen() {
        thread = new Thread(this);
        thread.start();
    }

    public void paint(Graphics g) {
        paintBG(g);
        snake.paint(g);
        vienDan.paint(g);
        myPlanes.paint(g);
        dichLevel1.paint(g);

        title.paint(g);
        myTank.paint(g);
//        quanDich.paint(g);
    }

    public void paintBG(Graphics g) {
        // nền đen cả màn hình
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1001, 551);
        // kẻ dọc màn hình
        g.setColor(Color.WHITE);
        for (int i = 0; i <= 50; i++) {
            g.fillRect((1001 / 2), i, 1, 1);
        }
        for (int i = 450; i <= 551; i++) {
            g.fillRect((1001 / 2), i, 1, 1);
        }
        // kẻ ngang màn hình
        for (int j = 0; j <= 100; j++) {
            g.fillRect(j, (551 / 2), 1, 1);
        }
        for (int j = 900; j <= 1001; j++) {
            g.fillRect(j, (551 / 2), 1, 1);
        }
        // kẻ chắn màn hình
        // sọc trên
        for (int i = 100; i < (1001 - 100 - 1); i++) {
            g.fillRect(i, 50, 1, 1);
        }
        // sọc dưới
        for (int i = 100; i < (1001 - 100 - 1); i++) {
            g.fillRect(i, 450, 1, 1);
        }
        // sọc trái
        for (int i = 50; i < (551 - 100 - 1); i++) {
            g.fillRect(100, i, 1, 1);
        }
        // sọc phải
        for (int i = 50; i < (551 - 100 - 1); i++) {
            g.fillRect(900, i, 1, 1);
        }

    }

    @Override
    public void run() {
        while (true) {
            title.update();
            myTank.update();
            snake.update();

            vienDan.update_viendan();
            repaint();
        }
    }
}
