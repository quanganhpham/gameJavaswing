package com.pqanh95.demgamebox;

import java.awt.*;

public class Box2 extends Sprite {
    private int box2_move;
    /*
     *    default:
     *      0 là lên trên
     *      1 là xuống dưới
     *      2 là sang trái
     *      3 là sang phải
     */


    public Box2(int x, int y, int box2_move) {
        super(x, y);
        this.box2_move = box2_move;
    }

    public int getBox2_move() {
        return box2_move;
    }

    public void setBox2_move(int box2_move) {
        this.box2_move = box2_move;
    }


    public void moveBox2() {
        if (box2_move == 0) {
            if (y > 0) {
                y--;
            } else {
                box2_move = 1;
            }
        } else if (box2_move == 1) {
            if (y < 600) {
                y++;
            } else {
                box2_move = 0;
            }
        } else if (box2_move == 2) {

            if (x > 0) {
                x--;
            } else {
                box2_move = 3;
            }
        } else {
            if (x < 800) {
                x++;
            } else {
                box2_move = 2;
            }
        }
    }


    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        if (box2_move == 0) {
            g.drawLine(x, y, x - 10, y + 20);
            g.drawLine(x - 10, y + 20, x + 10, y + 20);
            g.drawLine(x + 10, y + 20, x, y);
        } else if (box2_move == 1) {
            g.drawLine(x, y, x - 10, y - 20);
            g.drawLine(x - 10, y - 20, x + 10, y - 20);
            g.drawLine(x + 10, y - 20, x, y);
        } else if (box2_move == 2) {
            g.drawLine(x, y, x + 20, y - 10);
            g.drawLine(x + 20, y - 10, x + 20, y + 10);
            g.drawLine(x + 20, y + 10, x, y);
        } else {
            g.drawLine(x, y, x - 20, y - 10);
            g.drawLine(x - 20, y - 10, x - 20, y + 10);
            g.drawLine(x - 20, y + 10, x, y);
        }
    }

    public Rectangle getBound() {
        Rectangle r;
        switch (box2_move){
            case 0:
                r = new Rectangle(x,y);
                break;
            default:
                r = new Rectangle(x,y);
        }
        return r;
    }
}
