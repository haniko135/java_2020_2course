package ru.ikbo1319.experement.ex_8.pr_1;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, Color color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circleShape =  new Ellipse2D.Double(getX(), getY(), radius, radius);
        g2.draw(circleShape);
        g2.fill(circleShape);
    }
}
