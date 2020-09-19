package ru.ikbo1319.experement.ex_6;

import ru.ikbo1319.experement.ex_6.Movable;

public class MovableCircle extends MovablePoint implements Movable{
    private double radius;
    private double circleX = getPointX();
    private double circleY = getPointY();

    public MovableCircle(double pointX, double pointY, double radius) {
        super(pointX, pointY);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void move(double x, double y) {
        circleX += x;
        circleY += y;
        //добавить перемещение радиуса вместе с этой центральной точкой
        //принять во внимание задание кординат центра с помощью уравнений
    }
}
