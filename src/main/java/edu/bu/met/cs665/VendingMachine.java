package edu.bu.met.cs665;

public class VendingMachine {
    public Mode mode;

    VendingMachine(String beverage, String favor, int milk, int sugar) {
        if (beverage == "coffee") {
            mode = new CoffeeMode(favor, milk, sugar);
        }

        if (beverage == "tea") {
            mode = new TeaMode(favor, milk, sugar);
        }
    }

    VendingMachine(String beverage, String favor) {

        if (beverage == "coffee") {
            mode = new CoffeeMode(favor);
        }

        if (beverage == "tea") {
            mode = new TeaMode(favor);
        }

    }

    public String getMode() {
        return mode.getMode();
    }

//    @Override
//    public String toString() {
//        return mode.getMode() + " " + favor + " " + milk + " " + sugar;
//    }
}
