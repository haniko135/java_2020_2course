package ru.ikbo1319.experement.ex_3.Human_class;

public class Human {
    private Head head;
    private Body body;
    private Hand rightHand;
    private Hand leftHand;
    private Leg leftLeg;
    private Leg rightLeg;

    public Human(Head head, Body body, Hand rightHand, Hand leftHand, Leg leftLeg, Leg rightLeg){
        this.head = head;
        this.body = body;
        this.leftHand = leftHand;
        this.leftLeg = leftLeg;
        this.rightHand = rightHand;
        this.rightLeg = rightLeg;
    }

    public Human() {
    }

    public Head getHead(){
        return head;
    }

    public Body getBody() {
        return body;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", body=" + body +
                ", rightHand=" + rightHand +
                ", leftHand=" + leftHand +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                '}';
    }
}
