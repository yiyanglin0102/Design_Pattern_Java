/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Feb 23 2023
 * File Name: Shop.java
 * Description: A Shop class is created as an observable object that
 * updates notifications to driver observers.
 */

package edu.bu.met.cs665;

import java.util.ArrayList;

/**
 * Shop class object that is an observable.
 */
public class Shop {

  /**
   * class instance variables.
   */
  private String name;
  private String latestDriverUpdate;
  private ArrayList<Request> driverList = new ArrayList<>();

  /**
   * constructor of Shop class, set the name and initialize the first request message.
   *
   * @param name    name of shop
   * @param request first request message
   */
  public Shop(String name, String request) {
    this.name = name;
    this.setLatestDriverUpdate(request);
  }

  /**
   * constructor of Shop class, set the name and initialize the first request message to empty.
   *
   * @param name name of shop
   */
  public Shop(String name) {
    this.name = name;
    this.setLatestDriverUpdate("");
  }

  /**
   * get the current name of shop.
   *
   * @return current name of shop.
   */
  public String getName() {
    return this.name;
  }

  /**
   * set the instance name variable.
   *
   * @param name observable name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * set the current shop message to a list of drivers.
   *
   * @param latestDriverUpdate message to update
   */
  public void setLatestDriverUpdate(String latestDriverUpdate) {
    this.latestDriverUpdate = latestDriverUpdate;
    this.updateToSubscribers();
  }

  /**
   * get the message from current driver.
   *
   * @return the instance message from driver.
   */
  public String getLatestDriverUpdate() {
    return this.latestDriverUpdate;
  }

  /**
   * get the number of driver observables in the list.
   *
   * @return the number of current subscribers
   */
  public int getNumOfDrivers() {
    return this.driverList.size();
  }

  /**
   * unsubscribe the observable from driver list.
   *
   * @param driver remove from subscriber list.
   */
  public void unsubscribe(Request driver) {
    driverList.remove(driver);
  }

  /**
   * add driver to subscriber list.
   *
   * @param driver add driver to subscriber list.
   */
  public void subscribe(Request driver) {
    driverList.add(driver);
  }

  /**
   * update message to each driver object.
   */
  public void updateToSubscribers() {
    for (Request driver : driverList) {
      driver.updateSelf(this.latestDriverUpdate);
    }
  }

}
