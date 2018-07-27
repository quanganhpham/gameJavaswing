package com.anhpq95.ransanmoi;

import java.awt.*;

public class MyTank {
    private int x_dau;
    private int y_dau;
    private int x_duoi;
    private int y_duoi;
    private int x_new;
    private int y_new;


    public MyTank() {
    }

    public MyTank(int x_dau, int y_dau, int x_duoi, int y_duoi) {
        this.x_dau = x_dau;
        this.y_dau = y_dau;
        this.x_duoi = x_duoi;
        this.y_duoi = y_duoi;
    }

    public void setX(int x) {
        this.x_new = x;
    }

    public void setY(int y) {
        this.y_new = y;
    }

    public void update() {
        x_duoi = x_new;
        y_duoi = y_new;
    }

    public void paint(Graphics g) {
//        g.setColor(Color.white);
//        g.drawRect(x_dau - 8, y_dau, 5, 10);
//        g.drawRect(x_dau + 3, y_dau, 5, 10);
//        // 2 chỉ số cuối của trỏ chuột (x_duoi-10,y_duoi-30)
//        // nhiệm vụ tính ra được 2 chỉ số cuối của thanh bắn với độ dài là 8
//        int mouse_x = x_duoi - 10;
//        int mouse_y = y_duoi - 10;
//        double doDai1 = Math.sqrt((Math.pow((mouse_x - x_dau), 2) + Math.pow(mouse_y - y_dau, 2)));
//        double doDai2 = Math.pow((doDai1 - 64), 2);
//        double doDai3 = 64 - doDai2 - Math.pow(x_dau, 2) + Math.pow(mouse_x, 2) - Math.pow(y_dau, 2) + Math.pow(mouse_y, 2);
//        double doDai4 = 2 * (mouse_x - x_dau);
//        double doDai5 = 2 * (y_dau - mouse_y);
//        doDai3 = doDai3 / doDai4;
//        doDai5 = doDai5 / doDai4;
//        double doDai6 = Math.pow(x_dau, 2) + Math.pow(doDai3, 2) - 2 * y_dau * doDai3 + Math.pow(y_dau, 2) - 64;
//        double doDai7 = 1 + Math.pow(doDai5, 2);
//        double doDai8 = -2 * x_dau + 2 * doDai3 * doDai5 - 2 * y_dau * doDai5;
//        double delta = Math.pow(doDai8, 2) - 4 * doDai7 * doDai6;
//        double x1 = (-doDai8 + Math.pow(delta, 2)) / (2 * doDai7);
//        double x2 = (-doDai8 - Math.pow(delta, 2)) / (2 * doDai7);
//        System.out.println(x1+" "+x2);
//        g.drawLine(x_dau, y_dau, x_duoi - 10, y_duoi - 30);
//        g.fillRect(x * 20, y * 20, 18, 18);
//        g.setColor(Color.blue);
//        g.fillRect((x - 1) * 20, (y + 1) * 20, 18, 18);
//        g.fillRect((x - 1) * 20, (y + 2) * 20, 18, 18);
//        g.fillRect((x + 1) * 20, (y + 1) * 20, 18, 18);
//        g.fillRect((x + 1) * 20, (y + 2) * 20, 18, 18);
        g.setColor(Color.GREEN);
//        g.drawLine(x_dau,y); // A đến E

    }
}
