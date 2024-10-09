/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Email.java
 * Description: This class is responsible for the methods and attributes of a Email.
 */

package edu.bu.met.cs665.email;

/**
 * This is the Returning class.
 * This class is responsible for representing a Returning.
 */
public class Returning implements Email {

  private String greeting = "Welcome back!";

  /**
   * Send email message to our clients.
   * 
   * @param message The customized message that sends to clients
   */
  @Override
  public void sendEmail(String message) {
    System.out.println(greeting);
    System.out.println(message);
  }

}
