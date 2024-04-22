package edu.bu.met.cs665;

/**
 * A VendingMachine class to be created as new object in Main
 */
public class VendingMachine {
    public Mode mode;

    /**
     * Constructor of VendingMachine class
     *
     * @param beverage
     */
    VendingMachine(String beverage) {
        if (beverage == "coffee") {
            mode = new CoffeeMode();
        }

        if (beverage == "tea") {
            mode = new TeaMode();
        }
    }

    /**
     * Constructor of VendingMachine class
     *
     * @param beverage
     * @param milk
     * @param sugar
     */
    VendingMachine(String beverage, int milk, int sugar) {
        if (beverage == "coffee") {
            mode = new CoffeeMode(milk, sugar);
        }

        if (beverage == "tea") {
            mode = new TeaMode(milk, sugar);
        }
    }

    /**
     * @return the initialized instance
     */
    public Mode getMode() {
        return mode;
    }

}
