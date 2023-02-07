package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

// Write some Unit tests for your program like the following.

public class Test {

    @org.junit.Test
    public void test1_GetNumberMilk() {

        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);
        vm.getMode().addMilk();

        assertEquals(2, vm.getMode().getMilk());

    }


    @org.junit.Test
    public void test2_GetNumberSugar() {
        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);
        vm.getMode().addSugar();

        assertEquals(3, vm.getMode().getSugar());
    }

    @org.junit.Test
    public void test3_Get_Correct_Coffee_Espresso_Message() {
        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);
        assertEquals("You got Espresso! with milk :1 sugar :2", vm.getMode().makeEspresso());
    }

    @org.junit.Test
    public void test4_Get_0_Milk_and_0_Sugar_After_Made_Beverage() {
        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);
        vm.getMode().makeEspresso();

        assertEquals(0, vm.getMode().getSugar());
    }

    @org.junit.Test
    public void test5_Get_1_Milk_and_1_Sugar_After_Made_Beverage() {
        VendingMachine vm =
                new VendingMachine
                        ("tea", 1, 2);
        vm.getMode().makeYellowTea();
        vm.getMode().addMilk();
        vm.getMode().addMilk();
        vm.getMode().addSugar();

        assertEquals(1, vm.getMode().getSugar());
        assertEquals(2, vm.getMode().getMilk());
    }


}
