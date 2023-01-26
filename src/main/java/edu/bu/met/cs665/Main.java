package edu.bu.met.cs665;

public class Main {

    public static void main(String[] args)
    {

        VendingMachine vm =
                new VendingMachine
                        ("coffee", "Espresso", 3, 3);

        System.out.println(vm.getMode());
    }

}
