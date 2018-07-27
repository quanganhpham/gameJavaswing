package com.anhpq95.ransanmoi;

import java.awt.*;

public class MyPlanes {
    private int x;
    private int y;

    public MyPlanes(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPlanes() {
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.drawLine(x,y,x-1,y+6);// A đế E
        g.drawLine(x-1,y+6,x,y+8); // E đến H
        g.drawLine(x,y,x+1,y+6); // A đến F
        g.drawLine(x+1,y+6,x,y+8); // F đến H
        g.setColor(Color.RED);
        g.drawLine(x-2,y+1,x-6,y+6); // B đến D
        g.drawLine(x-6,y+6,x-2,y+11);// D đến I
        g.drawLine(x-2,y+11,x-2,y+1); // I đến B

        g.drawLine(x+2,y+1,x+6,y+6); // C đến G
        g.drawLine(x+6,y+6,x+2,y+11);// G đến K
        g.drawLine(x+2,y+11,x+2,y+1); // K đến C
        g.setColor(Color.YELLOW);
        g.drawLine(x,y+6,x,y+6);
    }
}
