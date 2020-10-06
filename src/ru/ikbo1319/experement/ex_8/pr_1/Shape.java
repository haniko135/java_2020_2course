package ru.ikbo1319.experement.ex_8.pr_1;

import javax.swing.*;
import java.awt.*;

public class Shape extends JComponent {
    private int x;
    private int y;
    private Color colorShape;

    public Shape(int x, int y, Color colorShape) {
        this.x = x;
        this.y = y;
        this.colorShape = colorShape;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColorShape() {
        return colorShape;
    }

    public void setColorShape(Color colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
    }
}
