package edu.bu.met.cs665;

public class VendingMachine {
    public Mode mode;

    VendingMachine(String beverage) {
        if (beverage == "coffee") {
            mode = new CoffeeMode();
        }

        if (beverage == "tea") {
            mode = new TeaMode();
        }
    }

    VendingMachine(String beverage, int milk, int sugar) {
        if (beverage == "coffee") {
            mode = new CoffeeMode(milk, sugar);
        }

        if (beverage == "tea") {
            mode = new TeaMode(milk, sugar);
        }
    }


    public Mode getMode() {
        return mode;
    }

}
