/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Feb 23 2023
 * File Name: Main.java
 * Description: This Main class is to implement Delivery Application
 * Notification System project solution.
 */

package edu.bu.met.cs665;

/**
 * The Main class to implement project solution.
 */
public class Main {

  /**
   * The main method is used to create a Shop observable object
   * connecting with Driver observer objects.
   *
   * @param args input string
   */
  public static void main(String[] args) {

    Shop shopSeller = new Shop("Union Oyster House", "New Oyster Request");
    Driver vanDriver = new Van("#1 Van", shopSeller);
    shopSeller.updateToSubscribers();
    System.out.println(vanDriver.getDriverLatestUpdate());

  }
}
