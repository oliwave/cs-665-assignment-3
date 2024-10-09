/**
 * Name: Wei Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/08/2024
 * File Name: Main.java
 * Description: The entry point of the program
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.email.Business;
import edu.bu.met.cs665.email.Email;
import edu.bu.met.cs665.email.Frequent;
import edu.bu.met.cs665.email.New;
import edu.bu.met.cs665.email.Returning;
import edu.bu.met.cs665.email.Vip;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project. This could prove convenient to test as you are
   * developing.
   * However, please note that every assignment/final projects requires JUnit
   * tests.
   */
  public static void main(String[] args) {
    Email business = new Business();
    EmailGenerator eg = new EmailGenerator(business);

    eg.sendEmail("Hello there!");

    eg.changeEmailTemplate(new Vip());

    eg.sendEmail("VIP VIP VIP!");

    eg.changeEmailTemplate(new Returning());

    eg.sendEmail("Great to have you back!");

    eg.changeEmailTemplate(new New());

    eg.sendEmail("We can't wait to server you!");

    eg.changeEmailTemplate(new Frequent());

    eg.sendEmail("How are you doing?");
  }
}
