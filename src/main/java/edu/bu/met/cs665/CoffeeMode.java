package edu.bu.met.cs665;

public class CoffeeMode extends Mode {

    public Mode mode;

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

    public void addMilk() {
        this.milk += 1;
        if (this.milk > 3)
        {
            this.milk = 3;
        }
    }

    public void addSugar() {
        this.sugar += 1;
        if (this.sugar > 3)
        {
            this.sugar = 3;
        }
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
        this.favor = "Macchiato";

        System.out.println("You got " + this.favor + "! with milk :" + this.milk
                + " sugar :" + this.sugar);
        this.milk = 0;
        this.sugar = 0;

    }

}
