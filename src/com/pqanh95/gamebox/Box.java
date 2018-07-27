package com.pqanh95.gamebox;

import java.awt.event.MouseEvent;

public class Box extends Sprite {
    private int dx;
    private int dy;

    public Box(int x, int y) {
        super(x, y);
        initBox();
    }

    private void initBox() {
        loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe1.png");
        getImageDimention();
    }

    public void move() {
        x = dx;
        y = dy;
    }

    public void mouseMoved(MouseEvent e) {
        if (dx > e.getX() && dy == e.getY()) {
            // trường hợp đi sang trái
            loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe11.png");
        }
        if (dx < e.getX() && dy == e.getY()) {
            // trường hợp đi sang phải
            loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe1.png");
        }
        if (dx == e.getX() && dy > e.getY()) {
            // trường hợp đi lên trên
            loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe1_lentren.png");
        }
        if (dx == e.getX() && dy < e.getY()) {
            // trường hợp đi xuống dưới
            loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe1_xuongduoi.png");
        }
        dx = e.getX();
        dy = e.getY();
    }
}
