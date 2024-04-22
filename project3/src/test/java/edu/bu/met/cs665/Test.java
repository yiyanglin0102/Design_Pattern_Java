/**
 * Name: Yi-Yang Lin
 * Course: CS-665 Software Designs & Patterns
 * Date: Mar 16 2023
 * File Name: Test.java
 * Description: A Test class that was created for testing the solution of
 * Email Generation Application System.
 */

package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

/**
 * JUnit test class
 */
public class Test {

  /**
   * Checking the VIP customer email is used default template in GreetingsMailTemplate.
   */
  @org.junit.Test
  public void test1_check_from_template_GreetingsMailTemplate() {

    Email VIPcustomer = new Vip();

    assertEquals("Greetings Mail Template ~ I hope this email finds you well ~",
            VIPcustomer.sentMail());
  }

  /**
   * Checking the New customer email is used default template in BaseEmailTemplate.
   */
  @org.junit.Test
  public void test2_check_from_template_BaseMailTemplate() {

    Email newCustomer = new New();

    assertEquals("Base Mail Template ~ Greetings ~",
            newCustomer.sentMail());
  }

  /**
   * Checking the default mail content can be overridden by passing in Generate object
   * to change the personalizedEmail() string method.
   */
  @org.junit.Test
  public void test3_check_personalizedEmail() {

    Email businessCustomer = new Business();

    Generate BusinessContent = new Generate() {
      @Override
      public String personalizedEmail() {
        return "As a business customer! In this mail ...";
      }
    };
    businessCustomer.writeCustomizedMail(BusinessContent);

    assertEquals(businessCustomer.sentMail(),
            "As a business customer! In this mail ...");
  }

  /**
   * Checking if the default email template is GreetingsMailTemplate
   * and after passing BaseEmailTemplate, the content of mail will
   * also be change to the BaseEmailTemplate.
   */
  @org.junit.Test
  public void test4_switch_business_customer_to_base_template() {
    Email businessCustomer = new Business();
    businessCustomer.writeCustomizedMail(new BaseEmailTemplate());

    assertEquals(businessCustomer.sentMail(),
            "Base Mail Template ~ Greetings ~");
  }

  /**
   * Checking if the default email template is BaseEmailTemplate
   * and after passing GreetingsMailTemplate, the content of mail will
   * also be change to the GreetingsMailTemplate.
   */
  @org.junit.Test
  public void test5_switch_returning_customer_to_greetings_mail_template() {
    Email returningCustomer = new Returning();
    returningCustomer.writeCustomizedMail(new GreetingsMailTemplate());

    assertEquals(returningCustomer.sentMail(),
            "Greetings Mail Template ~ I hope this email finds you well ~");
  }

}