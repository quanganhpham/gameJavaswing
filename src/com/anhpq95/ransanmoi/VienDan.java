package com.anhpq95.ransanmoi;

import java.awt.*;

public class VienDan {
    private int toaDoX = -1;
    private int toaDoY = -1;
    private long time;

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
        g.setColor(Color.white);
        g.fillRect(toaDoX * 20, toaDoY * 20, 18, 18);
    }

    public void update_viendan() {
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
