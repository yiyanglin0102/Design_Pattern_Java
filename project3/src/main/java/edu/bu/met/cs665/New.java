/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: New.java
 * Description: This New class is to implement general template
 * for New customer, if the informal greeting template is overridden by the
 * other Generate object message, the sentMail() from the parent method will
 * save the customized mail content.
 */

package edu.bu.met.cs665;

/**
 * A New class that extends Email class.
 */
public class New extends Email {
  /**
   * Constructor of New class.
   */
  public New() {
    this.type = Type.NewCustomerEmail;
    emailType = new BaseEmailTemplate();
  }

}
