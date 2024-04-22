/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Main.java
 * Description: This Main class is to implement Email Generation
 * Application System project solution.
 */

package edu.bu.met.cs665;

/**
 * The Main class to implement project solution.
 */
public class Main {

  /**
   * The main method is used to create an Email object with various
   * customer segments, including Business, Returning, Frequent, New, VIP,
   * to write interchangeable templates.
   *
   * @param args input string
   */
  public static void main(String[] args) {

    Email businessCustomer = new Business();
    businessCustomer.writeCustomizedMail(new Generate() {
      @Override
      public String personalizedEmail() {
        return "Greetings! You are our valuable customer This Business Mail wil find you well ~";
      }
    });
    System.out.println(businessCustomer.sentMail());
  }
}
