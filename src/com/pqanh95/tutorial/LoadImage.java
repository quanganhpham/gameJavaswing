package com.pqanh95.tutorial;

import javax.swing.*;
import java.awt.*;

public class LoadImage extends JPanel {
    private Image image;

    public LoadImage() {
        ImageIcon imageIcon = new ImageIcon("D://LAND1803E/GameRanSanMoi/src/com/pqanh95/gamebox/img/box.png");
        image = imageIcon.getImage();
        image.setAccelerationPriority(0.3f);
    }
    @Override
    protected void paintBorder(Graphics g) {
        g.drawImage(image,0,0, this);
    }

}
