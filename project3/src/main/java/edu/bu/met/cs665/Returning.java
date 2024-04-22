/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Main.java
 * Description: This Returning class is to implement general template
 * for Returning customer, if the formal greeting template is overridden by the
 * other Generate object message, the sentMail() from the parent method will
 * save the customized mail content.
 */

package edu.bu.met.cs665;

/**
 * A Returning class that extends Email class.
 */
public class Returning extends Email {
  /**
   * Constructor of Returning class.
   */
  public Returning() {
    this.type = Type.ReturningCustomerEmail;
    emailType = new GreetingsMailTemplate();
  }

}
