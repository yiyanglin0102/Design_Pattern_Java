/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Frequent.java
 * Description: This Frequent class is to implement general template
 * for Frequent customer, if the informal greeting template is overridden by the
 * other Generate object message, the sentMail() from the parent method will
 * save the customized mail content.
 */

package edu.bu.met.cs665;

/**
 * A Frequent class that extends Email class.
 */
public class Frequent extends Email {

  /**
   * Constructor of Frequent class.
   */
  public Frequent() {
    this.type = Type.FrequentCustomerEmail;
    emailType = new BaseEmailTemplate();
  }

}
