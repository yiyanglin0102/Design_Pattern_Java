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

    public void makeBlackTea() {
        this.favor = "Black Tea";

        System.out.println("You got " + this.favor + "! with milk :" + this.milk
                + " sugar :" + this.sugar);

        this.milk = 0;
        this.sugar = 0;
    }

    public void makeGreenTea() {
        this.favor = "Green Tea";

        System.out.println("You got " + this.favor + "! with milk :" + this.milk
                + " sugar :" + this.sugar);

        this.milk = 0;
        this.sugar = 0;
    }

    public void makeYellowTea() {
        this.favor = "Yellow Tea";

        System.out.println("You got " + this.favor + "! with milk :" + this.milk
                + " sugar :" + this.sugar);

        this.milk = 0;
        this.sugar = 0;
    }

}
