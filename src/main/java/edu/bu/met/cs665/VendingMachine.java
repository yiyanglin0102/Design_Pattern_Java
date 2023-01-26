package edu.bu.met.cs665;

public class VendingMachine {
    public Mode mode;

    VendingMachine(String input)
    {
        mode = new Mode(input);
    }

    @Override
    public String toString() {
        return mode.getMode();
    }
}
