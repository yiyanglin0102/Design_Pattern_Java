package edu.bu.met.cs665;

/**
 * A class to let user decide which mode the vending machine
 * is going to start, coffee or tea.
 */
public class Mode {

    String mode;
    String favor;
    int milk;
    int sugar;

    /**
     * Constructor of Mode class
     *
     * @param beverage
     */
    Mode(String beverage) {
        this.mode = beverage;
        this.milk = 0;
        this.sugar = 0;
    }

    /**
     * Adding 1 unit of the current milk
     */
    public void addMilk() {
        this.milk += 1;
        if (this.milk > 3) {
            this.milk = 3;
        }
    }

    /**
     * Adding 1 unit of the current sugar
     */
    public void addSugar() {
        this.sugar += 1;
        if (this.sugar > 3) {
            this.sugar = 3;
        }
    }

    /**
     * @return the unit of current milk on vending machine
     */
    public int getMilk() {
        return this.milk;
    }

    /**
     * @return the unit of current sugar on vending machine
     */
    public int getSugar() {
        return this.sugar;
    }

    /**
     * method be overridden in CoffeeMode class
     *
     * @return empty string
     */
    public String makeEspresso() {
        return "";
    }

    /**
     * method be overridden in CoffeeMode class
     *
     * @return empty string
     */
    public String makeAmericano() {
        return "";
    }

    /**
     * method be overridden in CoffeeMode class
     *
     * @return empty string
     */
    public String makeLatteMacchiato() {
        return "";
    }

    /**
     * method be overridden in TeaMode class
     *
     * @return empty string
     */
    public String makeBlackTea() {
        return "";
    }

    /**
     * method be overridden in TeaMode class
     *
     * @return empty string
     */
    public String makeGreenTea() {
        return "";
    }

    /**
     * method be overridden in TeaMode class
     *
     * @return empty string
     */
    public String makeYellowTea() {
        return "";
    }
}
