package ru.ikbo1319.experement.ex_9;

import ru.ikbo1319.experement.ex_8.pr_1.Circle;
import ru.ikbo1319.experement.ex_8.pr_1.Rectangle;
import ru.ikbo1319.experement.ex_8.pr_1.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WindowWithButton extends JFrame{
    private static Random random = new Random();
    public static int x = 20;
    public static int y = 50;

    public static Color colorRandom(){
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r,g,b);
    }

    public Shape paintShape()
    {
        Color colorShape = colorRandom();
        int nx = x;
        int ny = y;
        if (x + 100 <= 1000 - 100){
            x += 75;
        } else {
            x = 10;
            y += 100;
        }
        int wdth = random.nextInt(50) + 50;
        int hght = random.nextInt(50) + 25;
        switch (random.nextInt(2)){
            case 0:
                return new Circle(nx, ny, colorShape, wdth / 2);
            case 1:
                return new Rectangle(nx, ny, colorShape, wdth, hght);
        }
        return new Circle(10, 10, colorShape, wdth * 2);

    }

    public void randomShape(JLayeredPane pane){
        Shape shape = paintShape();
        shape.setBounds(0, 0, 1000, 800);
        pane.add(shape);
    }

    WindowWithButton(){
        super("Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JLayeredPane pane = getLayeredPane();
        JButton jButton = new JButton("Click");
        jButton.setBounds(25,25,100,50);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomShape(pane);
            }
        });

        pane.add(jButton);
        setSize(1000, 800);
        setVisible(true);
    }

    public static void main (String[] args){
        new WindowWithButton();
    }
}
