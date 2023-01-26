package edu.bu.met.cs665;

public class Mode {

    public String mode;
    public String favor;
    public int milk;
    public int sugar;

    Mode(String beverage) {
        this.mode = beverage;
        this.milk = 0;
        this.sugar = 0;
    }

    public String getMode() {
        return mode;
    }

    public void addMilk() {

    }

    public int getMilk() {
        return this.milk;
    }

    public void addSugar() {

    }

    public int getSugar() {
        return this.sugar;
    }

    public void makeEspresso() {
    }

    public void makeAmericano() {
    }

    public void makeLatteMacchiato() {
    }
}
