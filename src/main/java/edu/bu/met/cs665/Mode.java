package edu.bu.met.cs665;

public class Mode {

    String mode;
    String favor;
    int milk;
    int sugar;

    Mode(String beverage) {
        this.mode = beverage;
        this.milk = 0;
        this.sugar = 0;
    }

    public void addMilk() {
        this.milk += 1;
        if (this.milk > 3) {
            this.milk = 3;
        }
    }

    public void addSugar() {
        this.sugar += 1;
        if (this.sugar > 3) {
            this.sugar = 3;
        }
    }

    public int getMilk() {
        return this.milk;
    }

    public int getSugar() {
        return this.sugar;
    }

    public String makeEspresso() {
        return "";
    }

    public String makeAmericano() {
        return "";
    }

    public String makeLatteMacchiato() {
        return "";
    }

    public String makeBlackTea() {
        return "";
    }

    public String makeGreenTea() {
        return "";
    }

    public String makeYellowTea() {
        return "";
    }
}
