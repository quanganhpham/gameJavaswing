package com.pqanh95.gamebox;

public class Enemy extends Sprite implements Common {
    private Status status;

    public Enemy(int x, int y) {
        super(x, y);
        initEnemy();
    }

    private void initEnemy() {
        loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe2.png");
        getImageDimention();
        int rand = (int) (Math.random() * 4 + 1);
        switch (rand) {
            case 1:
                status = Status.UP;
                break;
            case 2:
                status = Status.DOWN;
                break;
            case 3:
                status = Status.LEFT;
                break;
            case 4:
                status = Status.RIGHT;
                break;
        }
        setVisible(true);
    }

    public void move() {
        if (x <= 0)
            status = Status.RIGHT;
        if (x > WIDTH - width)
            status = Status.LEFT;
        if (y <= 0)
            status = Status.DOWN;
        if (y > HEIGHT - height)
            status = Status.UP;

        switch (status) {
            case UP:
                y -= ENEMY_SPEED;
                loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe22.png");
                break;
            case DOWN:
                y += ENEMY_SPEED;
                loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe23.png");
                break;
            case LEFT:
                x -= ENEMY_SPEED;
                loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe2.png");
                break;
            case RIGHT:
                x += ENEMY_SPEED;
                loadImage("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/xe21.png");
                break;
        }
    }


}
