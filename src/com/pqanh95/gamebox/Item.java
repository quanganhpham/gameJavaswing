package com.pqanh95.gamebox;

public class Item extends Sprite {
    public Item(int x, int y) {
        super(x, y);
        initItem();
    }

    private void initItem() {
        loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/item.jpg");
        getImageDimention();
        setVisible(true);
    }

}
