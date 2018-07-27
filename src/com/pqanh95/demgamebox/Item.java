package com.pqanh95.demgamebox;

import java.awt.*;

public class Item extends Sprite {
    private int r;
    private boolean visble;

    public Item(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public boolean isVisible() {
        return visble;
    }

    public void setVisble(boolean visble) {
        this.visble = visble;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawArc(x, y, r, r, 0, 500);
    }
}
