package com.pqanh95.demgamebox;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Box1 extends Sprite {
    private int width;
    private int height;
    private int dx;
    private int dy;

    public Box1(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void box1Move() {
        x = dx;
        y = dy;
    }

    public void mouseMoved(MouseEvent e) {
        dx = e.getX() - 14;
        dy = e.getY() - 14;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRoundRect(x, y, width, height, 10, 10);
    }

    public Rectangle getBound() {
        return new Rectangle(x, y, width, height);
    }
}
