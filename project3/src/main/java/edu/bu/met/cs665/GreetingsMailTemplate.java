/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Main.java
 * Description: Provides a formal greeting message for Business,
 * Returning, VIP customer email messages.
 */

package edu.bu.met.cs665;

/**
 * A general formal greeting message template for Business, Returning,
 * VIP customer email messages.
 */
public class GreetingsMailTemplate implements Generate {

  /**
   * Formal template string if personalizedEmail() is not overridden.
   *
   * @return Formal Mail Template
   */
  @Override
  public String personalizedEmail() {
    return "Greetings Mail Template ~ I hope this email finds you well ~";
  }
}
