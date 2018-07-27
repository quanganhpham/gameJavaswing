package com.pqanh95.demgamebox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class MainBoard extends JPanel implements ActionListener, Common1 {

    private Box1 box1;
    private ArrayList<Box2> box2s;
    private Item item;
    private Timer timer;
    private boolean inGame;
    private int point;
    private Random random;

    public MainBoard() {
        init();
    }

    private void init() {
        random = new Random();
        inGame = true;
        point = 0;
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                box1.mouseMoved(e);
            }
        });
        setFocusable(true);
        setBackground(Color.black);
        setDoubleBuffered(true);
        // init box1
        box1 = new Box1(INIT_BOX_X, INIT_BOX_Y, WIDTH_BOX, HEIGHT_BOX);
        box2s = new ArrayList<>();
        // init box2
        initBox2();
        // init item
        initItem();
        // timer
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void initBox2() {
        int initX = (int) (Math.random() * (Common1.WIDTH_FRAME - 100));
        int initY = (int) (Math.random() * (Common1.HEIGHT_FRAME - 100));
        int isMove = random.nextInt(4);
        box2s.add(new Box2(initX, initY, isMove));
    }

    public void initItem() {
        int initX = (int) (Math.random() * (Common1.WIDTH_FRAME - 100));
        int initY = (int) (Math.random() * (Common1.HEIGHT_FRAME - 100));
        item = new Item(initX, initY, 25);
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
        // box1
        box1.paint(g);
        // box2
        for (Box2 box2 : box2s) {
            box2.paint(g);
        }
        // item
        item.paint(g);

        // Draw Point
        Font font = new Font("Arial", Font.BOLD, 12);
        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString("Your point: " + point, 5, 15);
    }

    private void drawGameOver(Graphics g) {
        Font font = new Font("Helvetica", Font.BOLD, 20);
        g.setColor(Color.WHITE);
        g.setFont(font);
        g.drawString("Game over!", 350, Common1.HEIGHT_FRAME / 2);
        g.drawString("Score: " + point, 370, Common1.HEIGHT_FRAME / 2 + 30);
        g.drawString("Nhấn chữ P để chơi lại!", 370, Common1.HEIGHT_FRAME / 2 + 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inGame();
        updateBox1();
        updateBox2();
        checkMove();
        repaint();
    }


    private void inGame() {
        if (!inGame) {
            timer.stop();
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_P) {
                        inGame = true;
                        resetData();
                        timer.start();
                    }
                }
            });
        }
    }


    private void resetData() {
        point = 0;
        for (int i = box2s.size() - 1; i >= 0; i--) {
            box2s.remove(i);
        }
        initBox2();
        initItem();
    }

    private void updateBox1() {
        box1.box1Move();
    }

    private void updateBox2() {
        for (int i = 0; i < box2s.size(); i++) {
            box2s.get(i).moveBox2();
        }
    }

    private void checkMove() {
        Rectangle rectangleBox1 = box1.getBound();
        // ăn đc item
        if (box1.getX() > (item.getX() - 5) && box1.getX() < (item.getX() + 5)) {
            if (box1.getY() > (item.getY() - 5) && box1.getY() < (item.getY() + 5)) {
                initItem();
                point++;
                initBox2();
            }
        }
//        System.out.println("Tọa độ box1: ("+box1.getX()+";"+box1.getY()+")");
//        System.out.println("Tọa độ box2: ("+box2s.get(0).getX()+";"+box2s.get(0).getY()+")");
        // va chạm box2

        for (Box2 box2 : box2s) {

//            if (box2.getX() >= box1.getX() && box2.getX() <= box1.getX() + 30) {
//                if (box2.getY() >= box1.getY() && box2.getY() <= box1.getY() + 30) {
//                    inGame = false;
//                }
//            }
//            if ((box2.getX() - 10) >= box1.getX() && (box2.getX() - 10) <= box1.getX() + 30) {
//                if ((box2.getY() + 20) >= box1.getY() && (box2.getY() + 20) <= box1.getY() + 30) {
//                    inGame = false;
//                }
//            }
//            if ((box2.getX() + 10) >= box1.getX() && (box2.getX() + 10) <= box1.getX() + 30) {
//                if ((box2.getY() + 20) >= box1.getY() && (box2.getY() + 20) <= box1.getY() + 30) {
//                    inGame = false;
//                }
//            }

        }
    }

}
