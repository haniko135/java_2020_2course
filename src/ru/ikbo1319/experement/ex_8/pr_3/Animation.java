package ru.ikbo1319.experement.ex_8.pr_3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Animation extends JFrame {
    private static final String path = "/Users/Бабушка/IdeaProjects/untitled1/src/ru/ikbo1319/experement/ex_8/pr_2/";
    String[] frames = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg"};
    private static String firstFrame = "/Users/Бабушка/IdeaProjects/untitled1/src/ru/ikbo1319/experement/ex_8/pr_2/1.jpg";
    JFrame jf;

    public void animate(){
        int i = 0;
        while (true){
            firstFrame = path + frames[i];
            i = (i + 1) % 10;
            System.out.println(i);
            try {

            }
            catch (Exception exc) {
                exc.printStackTrace();
            }
            jf.repaint();
        }
    }

    Animation(){
        jf = new JFrame("Task 3");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setDefaultLookAndFeelDecorated(true);
        jf.setVisible(true);
        jf.setLayout(new BorderLayout());
        jf.setSize(700, 700);
        jf.add(new AnimationPanel());
        jf.pack();
        animate();
    }

    public static class AnimationPanel extends JPanel{
        private Image image;

        public void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
            try{
                File file = new File(firstFrame);
                image = ImageIO.read(file);
            }
            catch (IOException e){
                e.printStackTrace();
            }
            g2.drawImage(image, 50, 50, this);
        }
    }

    public static void main(String[] args){
        new Animation();
    }
}
