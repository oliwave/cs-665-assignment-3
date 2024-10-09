/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Business.java
 * Description: This class is responsible for the methods and attributes of a Business.
 */

package edu.bu.met.cs665.email;

/**
 * This is the Business class.
 * This class is responsible for representing a Business.
 */
public class Business implements Email {

  String greeting = "Dear partner!";

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
