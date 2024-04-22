/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Feb 23 2023
 * File Name: Driver.java
 * Description: A general Driver class is created as an observer
 * object that has subclasses of Van, Taxi, Scooter types.
 */

package edu.bu.met.cs665;

/**
 * A general Driver class implements to Request class.
 */
abstract class Driver implements Request {

  /**
   * Van, Taxi and Scooter have different size of delivery loadings.
   */
  enum LoadingSize {
    LOW, // Scooter
    MEDIUM, // Taxi
    HIGH // Van
  }

  /**
   * class instance variables.
   */
  private Shop controlledShop;
  private String driverName;
  private String latestDriverUpdate;

  /**
   * An abstract function that will be overridden by subclasses.
   */
  public abstract void deliverLoadingSize();

  /**
   * Constructor of Driver class.
   *
   * @param driverName     observer name
   * @param controlledShop observable name
   */
  public Driver(String driverName, Shop controlledShop) {
    this.driverName = driverName;
    this.controlledShop = controlledShop;
    this.latestDriverUpdate = "";
    this.controlledShop.subscribe(this);
  }

  /**
   * Shop observable will call this method to update its observers.
   *
   * @param latestUpdate update message
   */
  public void updateSelf(String latestUpdate) {
    this.latestDriverUpdate = latestUpdate;

    System.out.println("The update was sent to "
            + this.getDriverName()
            + ": "
            + getDriverLatestUpdate());
  }

  /**
   * get the name of current driver.
   *
   * @return name of the current driver.
   */
  public String getDriverName() {
    return this.driverName;
  }

  /**
   * used for changing the name of current Driver name.
   *
   * @return change name of the current driver.
   */
  public String setDriverName() {
    return this.driverName;
  }

  /**
   * used for getting the latest message from shop.
   *
   * @return the current update received from shop.
   */
  public String getDriverLatestUpdate() {
    return this.latestDriverUpdate;
  }

}
