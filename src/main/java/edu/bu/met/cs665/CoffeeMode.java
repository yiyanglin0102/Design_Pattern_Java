package edu.bu.met.cs665;

public class CoffeeMode extends Mode {

    public String favor;
    public int milk;
    public int sugar;

    CoffeeMode(String favor) {
        super("coffee");
        this.favor = favor;
        this.milk = 0;
        this.sugar = 0;
    }

    CoffeeMode(String favor, int milk, int sugar) {
        super("coffee");
        this.favor = favor;
        this.milk = milk;
        this.sugar = sugar;
    }

    public void makeEspresso() {
        System.out.println("You got Espresso! with milk :" + this.milk
                + " sugar :" + this.sugar);

    }

    public void makeAmericano() {
        System.out.println("You got Americano! with milk :" + this.milk
                + " sugar :" + this.sugar);
    }

    public void makeLatteMacchiato() {
        System.out.println("You got Macchiato! with milk :" + this.milk
                + " sugar :" + this.sugar);
    }

}
