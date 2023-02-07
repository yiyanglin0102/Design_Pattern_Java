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

    public String makeEspresso() {
        this.favor = "Espresso";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;
    }

    public String makeAmericano() {
        this.favor = "Americano";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;
    }

    public String makeLatteMacchiato() {
        this.favor = "Latte Macchiato";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;
    }

}
