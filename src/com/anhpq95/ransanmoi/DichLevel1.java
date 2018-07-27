package com.anhpq95.ransanmoi;

import java.awt.*;

public class DichLevel1 {
    private int x;
    private int y;

    public DichLevel1() {
    }

    public DichLevel1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g){
        g.drawLine(x, y, x-4, y-10); // A đến B
        g.drawLine(x-4, y-10, x, y-7); // B đến D
        g.drawLine(x, y-7, x+4, y-10); // D đến C
        g.drawLine(x+4, y-10, x, y);
    }
}
