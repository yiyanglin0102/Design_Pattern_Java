package edu.bu.met.cs665;

public class Main {

    public static void main(String[] args) {

        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);

        VendingMachine vm1 =
                new VendingMachine
                        ("coffee");

        vm.getMode().addMilk();
        vm.getMode().addMilk();
        vm.getMode().addMilk();
//        vm.getMode().addMilk();
        vm.getMode().makeEspresso();

        System.out.println(vm.getMode().getMilk());

    }

}
