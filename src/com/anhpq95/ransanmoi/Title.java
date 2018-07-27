package com.anhpq95.ransanmoi;

import java.awt.*;

public class Title {
    private int x;
    private int y;
    private int x_new;
    private int y_new;

    public Title() {
    }

    public void setX(int x) {
        this.x_new = x;
    }

    public void setY(int y) {
        this.y_new = y;
    }

    public void update() {
        x = x_new;
        y = y_new;
    }

    public void paint(Graphics g) {
        g.drawString("Tọa độ chuột: (" + x + "," + y + ") ", 10, 15);
    }
}
