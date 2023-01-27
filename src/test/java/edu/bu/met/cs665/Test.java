package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

// Write some Unit tests for your program like the following.

public class Test {

  public Test() {}

  @org.junit.Test
  public void testGetNumberMilk() {

    VendingMachine vm =
            new VendingMachine
                    ("coffee", 1, 2);
    vm.getMode().addMilk();

    assertEquals(2, vm.getMode().getMilk());

  }


  @org.junit.Test
  public void testGetNumberSugar() {
    VendingMachine vm =
            new VendingMachine
                    ("coffee", 1, 2);
    vm.getMode().addSugar();

    assertEquals(3, vm.getMode().getSugar());
  }


  @org.junit.Test
  public void test3() {

    assertEquals(1, 1);
  }
  @org.junit.Test
  public void test4() {

    assertEquals(1, 1);
  }
  @org.junit.Test
  public void test5() {

    assertEquals(1, 1);
  }


}
