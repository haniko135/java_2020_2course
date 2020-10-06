package ru.ikbo1319.experement.ex_8.pr_1;

import java.awt.*;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int x, int y, Color colorShape, int length, int width) {
        super(x, y, colorShape);
        this.length = length;
        this.width = width;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(getColorShape());
        g2.fillRect(getX(),getY(),width,length);
    }
}
