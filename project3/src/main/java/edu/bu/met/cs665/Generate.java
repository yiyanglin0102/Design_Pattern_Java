/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Generate.java
 * Description: The Generate interface class is a strategy class in design
 * pattern to be created to define personalized Email content.
 */

package edu.bu.met.cs665;

/**
 * An interface for BaseEmailTemplate and GreetingsMailTemplate.
 */
public interface Generate {
  /**
   * Return edited mail content and override the default content if needed.
   *
   * @return mail content string
   */
  String personalizedEmail();
}
