package ru.ikbo1319.experement.ex_3.Human_class;

public class Head extends Human{
    private String brains;
    private String eye;
    private String mouth;
    private String nose;
    private String ears;
    private String neck;

    public Head(){
        setBrains("brains");
        setEars("two ears");
        setEye("two eyes");
        setMouth("mouth");
        setNeck("neck");
        setNose("nose");
    }

    public String getBrains() {
        return brains;
    }

    public String getEars() {
        return ears;
    }

    public String getEye() {
        return eye;
    }

    public String getMouth() {
        return mouth;
    }

    public String getNeck() {
        return neck;
    }

    public String getNose() {
        return nose;
    }

    public void setBrains(String brains) {
        this.brains = brains;
    }

    public void setEars(String ears) {
        this.ears = ears;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    @Override
    public String toString() {
        return "Head{" +
                "brains='" + brains + '\'' +
                ", eye='" + eye + '\'' +
                ", mouth='" + mouth + '\'' +
                ", nose='" + nose + '\'' +
                ", ears='" + ears + '\'' +
                ", neck='" + neck + '\'' +
                '}';
    }
}
