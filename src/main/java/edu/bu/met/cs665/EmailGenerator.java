/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Email.java
 * Description: This class is responsible for the methods and attributes of a Email.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.email.Email;

/**
 * This is the EmailGenerator class.
 * This class is responsible for representing a EmailGenerator.
 */
public class EmailGenerator {

  private Email email;

  /**
   * Create an object of a EmailGenerator.
   * 
   * @param email the specific email template
   */
  public EmailGenerator(Email email) {
    this.email = email;
  }

  /**
   * Change email template based on your targeted clients.
   * 
   * @param email The Email template you want to choose
   */
  public void changeEmailTemplate(Email email) {
    this.email = email;
  }

  /**
   * The customized email message added to the Email template.
   * 
   * @param message The customized message 
   */
  public void sendEmail(String message) {
    this.email.sendEmail(message);
  }

}
