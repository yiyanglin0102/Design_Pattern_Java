package edu.bu.met.cs665;

public class TeaMode extends Mode {

    /**
     * Constructor of TeaMode()
     */
    TeaMode() {
        super("tea");
        this.milk = 0;
        this.sugar = 0;
    }

    /**
     * Constructor of TeaMode()
     *
     * @param milk
     * @param sugar
     */
    TeaMode(int milk, int sugar) {
        super("tea");
        this.milk = milk;
        this.sugar = sugar;
    }

    /**
     * Override the makeBlackTea() method in mode class
     *
     * @return output beverage Black Tea message
     */
    public String makeBlackTea() {
        this.favor = "Black Tea";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;
    }

    /**
     * Override the makeGreenTea() method in mode class
     *
     * @return output beverage Green Tea message
     */
    public String makeGreenTea() {
        this.favor = "Green Tea";

        int tempMilk = this.milk;
        int tempSugar = this.sugar;

        this.milk = 0;
        this.sugar = 0;

        return "You got " + this.favor + "! with milk :" + tempMilk
                + " sugar :" + tempSugar;
    }

    /**
     * Override the makeYellowTea() method in mode class
     *
     * @return output beverage Yellow Tea message
     */
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
