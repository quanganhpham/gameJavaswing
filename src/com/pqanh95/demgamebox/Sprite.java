package com.pqanh95.demgamebox;

import java.awt.*;

abstract public class Sprite {
    protected int x;
    protected int y;


    public Sprite(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    abstract public void paint(Graphics g);
}
