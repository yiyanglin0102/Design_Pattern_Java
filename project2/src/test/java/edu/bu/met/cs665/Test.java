/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Feb 23 2023
 * File Name: Test.java
 * Description: A Test class that was created for testing the solution of
 * Delivery Application - Notification System.
 */

package edu.bu.met.cs665;

import java.util.Random;
import static org.junit.Assert.assertEquals;

/**
 * JUnit test class
 */
public class Test {

  /**
   * Check the initial message is announced and assert the result.
   */
  @org.junit.Test
  public void test1_Get_The_Initial_Request() {
    Shop shopSeller = new Shop("McDonald's", "Number 3 Meal combo request");
    Driver taxiDriver = new Taxi("#1 Taxi Driver", shopSeller);

    assertEquals(shopSeller.getLatestDriverUpdate(), "Number 3 Meal combo request");
  }

  /**
   * Randomly created 10 drivers and get the number of drivers.
   */
  @org.junit.Test
  public void test2_Correct_Number_Of_Drivers() {
    Random rand = new Random();
    int randomSelectDriverType;

    Shop shopSeller = new Shop("McDonald's", "Number 3 Meal combo request");
    for (int i = 0; i < 10; i++) {

      randomSelectDriverType = rand.nextInt(3);

      if (randomSelectDriverType == 0) {
        new Van("#" + i + " " + "Van Driver", shopSeller);
      } else if (randomSelectDriverType == 1) {
        new Van("#" + i + " " + "Taxi Driver", shopSeller);
      } else {
        new Van("#" + i + " " + "Scooter Driver", shopSeller);
      }
    }

    assertEquals(shopSeller.getNumOfDrivers(), 10);
  }

  /**
   * Check the subscribed driver got notified.
   */
  @org.junit.Test
  public void test3_Changed_The_Request_From_Shop() {
    Shop shopSeller = new Shop("McDonald's", "Number 3 Meal combo request");
    Driver vanDriver = new Van("Van Driver #1", shopSeller);
    shopSeller.setLatestDriverUpdate("oh no, the chicken is out of stock! Order Cancelled.");
    assertEquals(vanDriver.getDriverLatestUpdate(), "oh no, the chicken is out of stock! Order Cancelled.");
  }

  /**
   * Check the number of the subscribers are correct after unsubscribe 1 driver.
   */
  @org.junit.Test
  public void test4_Check_The_Number_Of_Subscribed_Drivers() {
    Shop shopSeller = new Shop("McDonald's");
    Driver d1 = new Van("Van Driver #1", shopSeller);
    Driver d2 = new Taxi("Taxi Driver #2", shopSeller);
    Driver d3 = new Scooter("Scooter Driver #3", shopSeller);
    Driver d4 = new Van("Van Driver #4", shopSeller);
    Driver d5 = new Van("Taxi Driver #5", shopSeller);
    shopSeller.unsubscribe(d3);
    assertEquals(shopSeller.getNumOfDrivers(), 4);
  }

  /**
   * Check the name of Shop is correct.
   */
  @org.junit.Test
  public void test5_Get_Shop_Name() {
    Shop shopSeller = new Shop("Saltie Girl Boston restaurant");
    assertEquals(shopSeller.getName(), "Saltie Girl Boston restaurant");
  }

}
