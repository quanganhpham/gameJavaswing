package com.anhpq95.ransanmoi;

import java.awt.*;

public class Snake {
    public static int LEN_TREN = 0;
    public static int XUONG_DUOI = 1;
    public static int SANG_PHAI = 2;
    public static int SANG_TRAI = 3;

    private int x;
    private int y;
    private int doDai = 1;
    private long time;
    private int vector = -1;

    public Snake() {
        setX(9);
        setY(17);
    }

    public int getVector() {
        return vector;
    }

    public void setVector(int vector) {
        this.vector = vector;
    }

    public int getX() {
        return x;
    }

    public void setX(int gtriX) {
        this.x = gtriX;
    }

    public int getY() {
        return y;
    }

    public void setY(int gtriY) {
        this.y = gtriY;
    }

    public void update() {
        int c = 0;
        switch (vector) {
            case -1:
                break;

            case 0:
                if (y > 0) {
                    c = -1;
                    //y--;
                    setY(getY() + c);
                }
                vector = -1;
                break;
            case 1:
                if (y < 17) {
                    c = 1;
                    //y++;
                    setY(getY() + c);
                }
                vector = -1;
                break;
            case 2:
                if (x < 18) {
                    c = 1;
                    //x++;
                    setX(getX() + c);
                }
                vector = -1;
                break;
            case 3:
                if (x > 1) {
                    c = -1;
                    //x--;
                    setX(getX() + c);
                }
                vector = -1;
                break;
            default:
                System.out.println("Chương trình đang không hiểu");
        }
//
        // Cài đặt khi chạm thành
//            if (x[0] > 18) {
//                x[0] = 0;
//            }
//            if (x[0] < 0) {
//                x[0] = 18;
//            }
//            if (y[0] > 18) {
//                y[0] = 0;
//            }
//            if (y[0] < 0) {
//                y[0] = 18;
//            }
        // Điều chỉnh hướng đi

//
//        }
//        if (System.currentTimeMillis() - time > 10) {

//            time = System.currentTimeMillis();
//        }
    }

    public void paint(Graphics g) {
            g.setColor(Color.yellow);
            g.fillRect(x * 20, y * 20, 18, 18);
            g.setColor(Color.blue);
            g.fillRect((x - 1) * 20, (y + 1) * 20, 18, 18);
            g.fillRect((x - 1) * 20, (y + 2) * 20, 18, 18);
            g.fillRect((x + 1) * 20, (y + 1) * 20, 18, 18);
            g.fillRect((x + 1) * 20, (y + 2) * 20, 18, 18);

    }
}
