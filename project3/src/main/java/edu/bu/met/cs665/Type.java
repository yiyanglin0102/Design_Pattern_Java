/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Type.java
 * Description: A general Driver class is created as an observer
 * object that has subclasses of Van, Taxi, Scooter types.
 */

package edu.bu.met.cs665;

/**
 * Enumerate different types of customer emails.
 */
public enum Type {
  BusinessCustomerEmail,
  NewCustomerEmail,
  VIPCustomerEmail,
  ReturningCustomerEmail,
  FrequentCustomerEmail
}