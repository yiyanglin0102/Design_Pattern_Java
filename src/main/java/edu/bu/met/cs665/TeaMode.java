package edu.bu.met.cs665;

public class TeaMode extends Mode {
    public String favor;
    public int milk;
    public int sugar;

    TeaMode(String favor) {
        super("Tea");
        this.favor = favor;
        this.milk = 0;
        this.sugar = 0;
    }

    TeaMode(String favor, int milk, int sugar) {
        super("Tea");
        this.favor = favor;
        this.milk = milk;
        this.sugar = sugar;
    }

    public void makeBlackTea() {
        System.out.println("You got Black Tea! with milk :" + this.milk
                + " sugar :" + this.sugar);
    }

    public void makeGreenTea() {
        System.out.println("You got Green Tea! with milk :" + this.milk
                + " sugar :" + this.sugar);
    }

    public void makeYellowTea() {
        System.out.println("You got Yellow Tea! with milk :" + this.milk
                + " sugar :" + this.sugar);
    }


}
