/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Feb 23 2023
 * File Name: Request.java
 * Description: An interface request list for drivers to subscribe and unsubscribe.
 */

package edu.bu.met.cs665;

/**
 * Request interface to share message to drivers.
 */
public interface Request {

  /**
   * update message to driver.
   *
   * @param message updated message
   */
  void updateSelf(String message);
}
