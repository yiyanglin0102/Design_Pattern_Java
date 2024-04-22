/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Email.java
 * Description: This Email class is to be implemented as a general parent class
 * for Business, Frequent, New, Returning, VIP children classes.
 */

package edu.bu.met.cs665;

/**
 * A general Email class.
 */
public class Email {

  /**
   * Define the type of mail.
   *   BusinessCustomerEmail,
   *   NewCustomerEmail,
   *   VIPCustomerEmail,
   *   ReturningCustomerEmail,
   *   FrequentCustomerEmail.
   */
  Type type;

  /**
   * Generate object class instance variables.
   */
  public Generate emailType;

  /**
   * Return the current saved email content.
   *
   * @return the current email content
   */
  public String sentMail() {
    return emailType.personalizedEmail();
  }

  /**
   * Return the type of customer mail.
   *
   * @return the type of customer mail
   */
  public Generate getEmailType() {
    return this.emailType;
  }

  /**
   * Inputting the customized mail other than default mail.
   *
   * @param email inputting the customized mail other than default mail
   */
  public void writeCustomizedMail(Generate email) {
    this.emailType = email;
  }
}
