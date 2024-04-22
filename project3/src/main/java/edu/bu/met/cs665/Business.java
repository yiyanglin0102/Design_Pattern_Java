/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Business.java
 * Description: This Business class is to implement general template
 * for business customer, if the formal greeting template is overridden by the
 * other Generate object message, the sentMail() from the parent method will
 * save the customized mail content.
 */

package edu.bu.met.cs665;

/**
 * A Business class that extends Email class.
 */
public class Business extends Email {

  /**
   * Constructor of Business class.
   */
  public Business() {
    this.type = Type.BusinessCustomerEmail;
    emailType = new GreetingsMailTemplate();
  }

}
