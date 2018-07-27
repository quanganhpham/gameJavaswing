package com.anhpq95.ransanmoi;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

public class FrameScreen extends JFrame {

    GameScreen gameScreen;

    public FrameScreen() {
        gameScreen = new GameScreen();
        add(gameScreen);
        this.addKeyListener(new handler());
        this.addMouseMotionListener(new MouseInputAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                gameScreen.title.setX(e.getX());
                gameScreen.title.setY(e.getY());
                gameScreen.myTank.setX(e.getX());
                gameScreen.myTank.setY(e.getY());
            }
        });
    }

    public static void main(String[] args) {
        FrameScreen frameScreen = new FrameScreen();
        frameScreen.setVisible(true);
        frameScreen.setSize(1001, 551);
        frameScreen.setResizable(false);
        frameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class handler implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
//            System.out.println("Qaa");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == (KeyEvent.VK_RIGHT |  KeyEvent.VK_UP )) {
                System.out.println("Quang Anh");
            }
//            if (e.getKeyCode() == KeyEvent.VK_UP) {
//                if (gameScreen.snake.getVector() == 1) {
//                    System.out.println("Mày ngáo đá ah! đang đâm đầu xuống mà lại chạy lên");
//                } else {
//                    gameScreen.snake.setVector(Snake.LEN_TREN);
//                }
//            }
//            if (e.getKeyCode() == KeyEvent.VK_UP && e.getKeyCode() == KeyEvent.VK_LEFT) {
//                System.out.println("Quang Anh");
//            }
//            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//                if (gameScreen.vienDan.getToaDoY() == -1) {
//                    gameScreen.vienDan.setToaDoX(gameScreen.snake.getX());
//                    gameScreen.vienDan.setToaDoY(gameScreen.snake.getY() - 1);
//                }
//            }
//            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//                if (gameScreen.snake.getVector() == 0) {
//                    System.out.println("Mày ngáo đá ah! đang đi lên mà lại đâm đầu xuống");
//                } else {
//                    gameScreen.snake.setVector(Snake.XUONG_DUOI);
//                }
//            }
//            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//                if (gameScreen.snake.getVector() == 2) {
//                    System.out.println("Mày ngáo đá ah! đang sang phải mà lại quay đầu lại trái");
//                } else {
//                    gameScreen.snake.setVector(Snake.SANG_TRAI);
//                }
//            }
//            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//                if (gameScreen.snake.getVector() == 3) {
//                    System.out.println("Mày ngáo đá ah! đang sang trái mà lại quay đầu lại phải");
//                } else {
//                    gameScreen.snake.setVector(Snake.SANG_PHAI);
//                }
//            }

        }

        @Override
        public void keyReleased(KeyEvent e) {
//            System.out.println("Qaung anh");
        }
    }
}
