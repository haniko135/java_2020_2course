package ru.ikbo1319.experement.ex_3.Human_class;

public class Hand extends Human {
    private String finger;
    private String elbow;
    private String forearm;
    private String shoulder;

    public Hand(){
        setElbow("elbow");
        setFinger("5 fingers");
        setForearm("forearm");
        setShoulder("shoulder");
    }

    public String getElbow() {
        return elbow;
    }

    public String getFinger() {
        return finger;
    }

    public String getForearm() {
        return forearm;
    }

    public String getShoulder() {
        return shoulder;
    }

    public void setElbow(String elbow) {
        this.elbow = elbow;
    }

    public void setFinger(String finger) {
        this.finger = finger;
    }

    public void setForearm(String forearm) {
        this.forearm = forearm;
    }

    public void setShoulder(String shoulder) {
        this.shoulder = shoulder;
    }
}
