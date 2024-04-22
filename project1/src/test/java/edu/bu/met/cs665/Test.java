package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

/**
 * Junit test class
 */
public class Test {

    /**
     * the output should be 2 units of milk
     */
    @org.junit.Test
    public void test1_GetNumberMilk() {

        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);
        vm.getMode().addMilk();

        assertEquals(2, vm.getMode().getMilk());

    }

    /**
     * The initial input "coffee", 1 unit of milk, 2 units of sugar,
     * after adding 1 unit of sugar,
     * the output should expect 3 units of sugar
     */
    @org.junit.Test
    public void test2_GetNumberSugar() {
        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);
        vm.getMode().addSugar();

        assertEquals(3, vm.getMode().getSugar());
    }

    /**
     * The initial input are "coffee", 1 unit of milk, 2 units of sugar,
     *  the output message string should show the vending machine's
     *  result
     */
    @org.junit.Test
    public void test3_Get_Correct_Coffee_Espresso_Message() {
        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);
        assertEquals("You got Espresso! with milk :1 sugar :2", vm.getMode().makeEspresso());
    }

    /**
     * The initial input are "coffee", 1 unit of milk, 2 units of sugar,
     * after consuming ingredients of milk and sugar by making Espresso,
     * the getSugar() method should output 0
     */
    @org.junit.Test
    public void test4_Get_0_Milk_and_0_Sugar_After_Made_Beverage() {
        VendingMachine vm =
                new VendingMachine
                        ("coffee", 1, 2);
        vm.getMode().makeEspresso();

        assertEquals(0, vm.getMode().getSugar());
    }

    /**
     * The initial input are "coffee", 1 unit of milk, 2 units of sugar,
     * after consuming ingredients of milk and sugar by making YellowTea,
     * and then continuously adding 2 units of milk and 1 unit of sugar,
     * the getSugar() and getMilk() method should output 1 anf 2 respectively
     */
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
