package com.pqanh95.gamebox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class MainBoard extends JPanel implements ActionListener, Common {
    private Item item;
    private ArrayList<Enemy> enemies;
    private Box box;
    private Timer timer;
    private boolean inGame;
    private int point;


    public MainBoard() {
        initBoard();
    }

    private void initBoard() {
        inGame = true;
        point = 0;
        addMouseMotionListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.lightGray);
        setDoubleBuffered(true);
        box = new Box(INIT_BOX_X, INIT_BOX_Y);
        enemies = new ArrayList<Enemy>();
        initEnemy();
        initItem();
        timer = new Timer(DELAY, this);
        timer.start();
    }

    private void initItem() {
        int initX = (int) (Math.random() * (Common.WIDTH - 100));
        int initY = (int) (Math.random() * (Common.HEIGHT - 100));
        item = new Item(initX, initY);
    }

    private void initEnemy() {
        int initX = (int) (Math.random() * (Common.WIDTH - 100));
        int initY = (int) (Math.random() * (Common.HEIGHT - 100));
        Enemy enemy = new Enemy(initX, initY);
        enemies.add(enemy);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (inGame) {
            drawObject(g);
        } else {
            drawGameOver(g);
        }
    }

    private void drawObject(Graphics g) {
        // Draw Box
        g.drawImage(box.getImage(), box.getX(), box.getY(), this);
        // Draw Enemies

        for (Enemy enemy : enemies) {
            g.drawImage(enemy.getImage(), enemy.getX(), enemy.getY(), this);
        }
        // Draw Item
        g.drawImage(item.getImage(), item.getX(), item.getY(), this);


        // Draw Point
        Font font = new Font("Arial", Font.BOLD, 12);
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString("Your point: " + point, 5, 15);
    }

    private void drawGameOver(Graphics g) {
        Font font = new Font("Helvetica", Font.BOLD, 20);
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString("Game over!", 350, Common.HEIGHT / 2);
        g.drawString("Score: " + point, 370, Common.HEIGHT / 2 + 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inGame();
        // Update Object
        updateBox();
        updateEnemy();
        updateItem();
        // Check collision
        checkCollisionItem();
        checkCollisionEnemy();
        // Repaint
        repaint();
    }

    private void checkCollisionItem() {
        // xảy ra va chạm
        // Va chạm 1: Ăn item
        // kiểm tra xử lý va chạm
        if (is_Collision(box.getX(), box.getY(), item.getX(), item.getY())) {
            point++;
            item.setVisible(false);
            initEnemy();
        }
    }
    private void checkCollisionEnemy(){
        // Va chạm 2: dính enemy
        for (int i = 0; i < enemies.size(); i++) {
            if (is_Enemy(box.getX(), box.getY(), enemies.get(i).getX(), enemies.get(i).getY())) {
                inGame = false;
                break;
            }
        }

    }

    private boolean is_Enemy(int x1, int y1, int x2, int y2) {
        if (x1 >= (x2 - 25)) {
            if (x1 <= (x2 + 25)) {
                if (y1 >= (y2 - 25)) {
                    if (y1 <= (y2 + 25)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean is_Collision(int x1, int y1, int x2, int y2) {
        if (x1 >= (x2 - 25)) {
            if (x1 <= (x2 + 25)) {
                if (y1 >= (y2 - 25)) {
                    if (y1 <= (y2 + 25)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void inGame() {
        if (!inGame) {
            timer.stop();
        }
    }

    private void updateBox() {
        box.move();
    }

    private void updateEnemy() {
        for (int i = 0; i < enemies.size(); i++) {
            Enemy enemy = enemies.get(i);
            if (enemy.isVisible()) {
                enemy.move();
            } else {
                enemies.remove(i);
            }
        }
    }

    private void updateItem() {
        if (!item.isVisible()) {
            initItem();
        }
    }

    private class TAdapter extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            box.mouseMoved(e);
        }
    }
}
