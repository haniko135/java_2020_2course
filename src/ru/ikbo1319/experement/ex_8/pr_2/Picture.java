package ru.ikbo1319.experement.ex_8.pr_2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Picture extends JComponent {
    private final int width = 50;
    private final int length = 50;
    private Image img;

    Picture(String path){
        try{
            File file = new File(path);
            img = ImageIO.read(file);
        }
        catch (IOException err){
            err.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, width, length, this);
    }
}
