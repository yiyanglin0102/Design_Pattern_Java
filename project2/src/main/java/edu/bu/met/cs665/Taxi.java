/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Feb 23 2023
 * File Name: Taxi.java
 * Description: A Taxi observer class that used for implementing functions for this type of Driver.
 */

package edu.bu.met.cs665;

/**
 * Taxi class extending from Driver class.
 */
public class Taxi extends Driver {
  /**
   * constructor of Taxi class calls parent class constructor
   * to initialize Driver functions and variables.
   *
   * @param driverName     Taxi driver name
   * @param controlledShop Shop name
   */
  public Taxi(String driverName, Shop controlledShop) {
    super(driverName, controlledShop);
  }

  /**
   * print the loading size of Taxi.
   */
  @Override
  public void deliverLoadingSize() {
    System.out.println("Taxi delivery loading size is " + LoadingSize.MEDIUM);
  }

}
