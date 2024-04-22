/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Vip.java
 * Description: This VIP class is to implement general template
 * for VIP customer, if the formal greeting template is overridden by the
 * other Generate object message, the sentMail() from the parent method will
 * save the customized mail content.
 */

package edu.bu.met.cs665;

/**
 * A VIP class that extends Email class.
 */
public class Vip extends Email {

  /**
   * Constructor of VIP class.
   */
  public Vip() {
    this.type = Type.VIPCustomerEmail;
    emailType = new GreetingsMailTemplate();
  }
}
