package edu.bu.met.cs665;

public class TeaMode extends Mode {

    TeaMode() {
        super("tea");
        this.milk = 0;
        this.sugar = 0;
    }

    TeaMode(int milk, int sugar) {
        super("tea");
        this.milk = milk;
        this.sugar = sugar;
    }

    public String makeBlackTea() {
        this.favor = "Black Tea";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;
    }

    public String makeGreenTea() {
        this.favor = "Green Tea";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;
    }

    public String makeYellowTea() {
        this.favor = "Yellow Tea";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;


    }

}
