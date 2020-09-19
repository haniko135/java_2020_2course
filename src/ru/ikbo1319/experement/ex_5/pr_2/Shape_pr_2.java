package ru.ikbo1319.experement.ex_5.pr_2;

public abstract class Shape_pr_2 {
    private String border_color;
    private boolean filled_color;

    public Shape_pr_2(String border_color, boolean filled_color) {
        this.border_color = border_color;
        this.filled_color = filled_color;
    }

    public String getBorder_color() {
        return border_color;
    }

    public void setBorder_color(String border_color) {
        this.border_color = border_color;
    }

    public boolean isFilled_color() {
        return filled_color;
    }

    public void setFilled_color(boolean filled_color) {
        this.filled_color = filled_color;
    }

    @Override
    public String toString() {
        return "Shape_pr_2{" +
                "border_color='" + border_color + '\'' +
                ", filled_color=" + filled_color +
                '}';
    }

    public abstract double area();
    public abstract double perimetr();
}
