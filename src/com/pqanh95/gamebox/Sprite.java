package com.pqanh95.gamebox;

import javax.swing.*;
import java.awt.*;

public class Sprite {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;

    public Sprite(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public Rectangle getBound() {
        return new Rectangle(x, y, width, height);
    }

    public void loadImage(String pathImage) {
        ImageIcon imageIcon = new ImageIcon(pathImage);
        image = imageIcon.getImage();
    }

    public void getImageDimention() {
        width = image.getWidth(null);
        height = image.getHeight(null);
    }
}
