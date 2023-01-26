package edu.bu.met.cs665;

public class Main {

    public static void main(String[] args) {

        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);

        VendingMachine vm1 =
                new VendingMachine
                        ("tea");

        vm1.getMode().addMilk();
        vm1.getMode().addMilk();
//        vm1.getMode().addMilk();
//        vm.getMode().addMilk();
//        vm1.getMode().makeGreenTea();

        System.out.println(vm1.getMode().getMilk());

    }

}
