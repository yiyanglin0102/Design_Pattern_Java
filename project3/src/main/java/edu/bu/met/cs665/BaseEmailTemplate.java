/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Main.java
 * Description: Provides a shorter greeting message for informal New,
 * Frequent customer email message.
 */

package edu.bu.met.cs665;

/**
 * A general formal greeting message template for New,
 * Frequent customer email messages.
 */
public class BaseEmailTemplate implements Generate {

  /**
   * Informal template string if personalizedEmail() is not overridden.
   *
   * @return Base Mail Template
   */
  public String personalizedEmail() {
    return "Base Mail Template ~ Greetings ~";
  }
}
