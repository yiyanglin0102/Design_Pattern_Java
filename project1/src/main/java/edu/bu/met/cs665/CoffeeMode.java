package edu.bu.met.cs665;

public class CoffeeMode extends Mode {

    /**
     * Constructor of CoffeeMode()
     *
     */
    CoffeeMode() {
        super("coffee");
        this.milk = 0;
        this.sugar = 0;
    }

    /**
     * Constructor of CoffeeMode
     *
     * @param milk
     * @param sugar
     */
    CoffeeMode(int milk, int sugar) {
        super("coffee");
        this.milk = milk;
        this.sugar = sugar;
    }

    /**
     * Override the makeEspresso() method in mode class
     *
     * @return output beverage Espresso message
     */
    public String makeEspresso() {
        this.favor = "Espresso";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;
    }

    /**
     * Override the makeAmericano() method in mode class
     *
     * @return output beverage Americano message
     */
    public String makeAmericano() {
        this.favor = "Americano";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;
    }

    /**
     * Override the makeLatteMacchiato() method in mode class
     *
     * @return output beverage Latte Macchiato message
     */
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
