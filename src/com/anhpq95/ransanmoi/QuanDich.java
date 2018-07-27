package com.anhpq95.ransanmoi;

import java.awt.*;

public class QuanDich {
    private int toaDoX = -1;
    private int toaDoY = -1;
    private long time;

    public QuanDich(int x,int y) {
        setToaDoX(x);
        setToaDoY(y);
    }

    public int getToaDoX() {
        return toaDoX;
    }

    public void setToaDoX(int toaDoX) {
        this.toaDoX = toaDoX;
    }

    public int getToaDoY() {
        return toaDoY;
    }

    public void setToaDoY(int toaDoY) {
        this.toaDoY = toaDoY;
    }


    public void paint(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(toaDoX * 20, toaDoY * 20, 18, 18);
        g.setColor(Color.red);
        g.fillRect((toaDoX - 1) * 20, (toaDoY - 1) * 20, 18, 18);
        g.fillRect((toaDoX - 1) * 20, (toaDoY - 2) * 20, 18, 18);
        g.fillRect((toaDoX + 1) * 20, (toaDoY - 1) * 20, 18, 18);
        g.fillRect((toaDoX + 1) * 20, (toaDoY - 2) * 20, 18, 18);
    }

    public void update_quandich() {
        if (System.currentTimeMillis() - time > 60) {
            if (toaDoY >= 0) {
                toaDoY--;
            } else {
                toaDoY = -1;
            }

            time = System.currentTimeMillis();
        }
    }
}
