/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Feb 23 2023
 * File Name: Van.java
 * Description: A Van observer class that used for implementing functions for this type of Driver.
 */

package edu.bu.met.cs665;

/**
 * Van class extending from Driver class.
 */
public class Van extends Driver {
  /**
   * constructor of Van class calls parent class constructor
   * to initialize Driver functions and variables.
   *
   * @param driverName     Van driver name
   * @param controlledShop Shop name
   */
  public Van(String driverName, Shop controlledShop) {
    super(driverName, controlledShop);
  }

  /**
   * print the loading size of Van.
   */
  @Override
  public void deliverLoadingSize() {
    System.out.println("Van delivery loading size is " + LoadingSize.HIGH);
  }

}
