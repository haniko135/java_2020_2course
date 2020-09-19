package ru.ikbo1319.experement.ex_3.Human_class;

public class Body extends Human{
    private String stomach;
    private String lever;
    private String lung;
    private String heart;
    private String kidney;
    private String spine;
    private String gut;

    public Body(){
        setStomach("stomach");
        setSpine("spine");
        setLung("two lungs");
        setLever("lever");
        setKidney("two kidneys");
        setGut("two guts");
        setHeart("heart");
    }

    public String getStomach() {
        return stomach;
    }

    public String getSpine() {
        return spine;
    }

    public String getLung() {
        return lung;
    }

    public String getLever() {
        return lever;
    }

    public String getKidney() {
        return kidney;
    }

    public String getHeart() {
        return heart;
    }

    public String getGut() {
        return gut;
    }

    public void setStomach(String stomach) {
        this.stomach = stomach;
    }

    public void setSpine(String spine) {
        this.spine = spine;
    }

    public void setLung(String lung) {
        this.lung = lung;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public void setKidney(String kidney) {
        this.kidney = kidney;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public void setGut(String gut) {
        this.gut = gut;
    }

    @Override
    public String toString() {
        return "Body{" +
                "stomach='" + stomach + '\'' +
                ", lever='" + lever + '\'' +
                ", lung='" + lung + '\'' +
                ", heart='" + heart + '\'' +
                ", kidney='" + kidney + '\'' +
                ", spine='" + spine + '\'' +
                ", gut='" + gut + '\'' +
                '}';
    }
}
