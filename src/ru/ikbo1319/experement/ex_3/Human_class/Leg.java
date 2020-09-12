package ru.ikbo1319.experement.ex_3.Human_class;

public class Leg extends Human{
    private String foot;
    private String fingers;


    public Leg(){
        setFingers("5 fingers");
        setFoot("foot");
    }

    public String getFingers() {
        return fingers;
    }

    public String getFoot() {
        return foot;
    }

    public void setFingers(String fingers) {
        this.fingers = fingers;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}
