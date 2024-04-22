/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Feb 23 2023
 * File Name: Scooter.java
 * Description: A Scooter observer class that used for implementing
 * functions for this type of Driver.
 */

package edu.bu.met.cs665;

/**
 * Scooter class extending from Driver class.
 */
public class Scooter extends Driver {

  /**
   * constructor of Scooter class calls parent class constructor to
   * initialize Driver functions and variables.
   *
   * @param driverName     Scooter driver name
   * @param controlledShop Shop name
   */
  public Scooter(String driverName, Shop controlledShop) {
    super(driverName, controlledShop);
  }

  /**
   * print the loading size of Scooter.
   */
  @Override
  public void deliverLoadingSize() {
    System.out.println("Scooter delivery loading size is " + LoadingSize.LOW);
  }

}
