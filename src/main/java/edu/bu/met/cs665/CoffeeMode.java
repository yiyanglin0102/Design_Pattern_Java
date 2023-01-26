package edu.bu.met.cs665;

public class CoffeeMode extends Mode {

    CoffeeMode() {
        super("coffee");
        this.milk = 0;
        this.sugar = 0;
    }

    CoffeeMode(int milk, int sugar) {
        super("coffee");
        this.milk = milk;
        this.sugar = sugar;
    }

    public void makeEspresso() {
        this.favor = "Espresso";

        System.out.println("You got " + this.favor + "! with milk :" + this.milk
                + " sugar :" + this.sugar);
        this.milk = 0;
        this.sugar = 0;
    }

    public void makeAmericano() {
        this.favor = "Americano";

        System.out.println("You got " + this.favor + "! with milk :" + this.milk
                + " sugar :" + this.sugar);
        this.milk = 0;
        this.sugar = 0;
    }

    public void makeLatteMacchiato() {
        this.favor = "Latte Macchiato";

        System.out.println("You got " + this.favor + "! with milk :" + this.milk
                + " sugar :" + this.sugar);
        this.milk = 0;
        this.sugar = 0;
    }

}
