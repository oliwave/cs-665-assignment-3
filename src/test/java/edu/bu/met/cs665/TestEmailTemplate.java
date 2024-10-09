package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import edu.bu.met.cs665.email.Business;
import edu.bu.met.cs665.email.Frequent;
import edu.bu.met.cs665.email.New;
import edu.bu.met.cs665.email.Returning;
import edu.bu.met.cs665.email.Vip;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestEmailTemplate {

    EmailGenerator eg = new EmailGenerator(new Business());

    public TestEmailTemplate() {

    }

    @Test
    public void testBusinessEmailTemplate() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            // Redirect System.out to the output stream
            System.setOut(new PrintStream(outputStream));

            // Call the method that prints the message
            eg.sendEmail("Hello there!");

            // Assert that the output is what we expect
            assertEquals("Dear partner!\nHello there!\n",
                    outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }

    }

    @Test
    public void testVipEmailTemplate() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            // Redirect System.out to the output stream
            System.setOut(new PrintStream(outputStream));

            // Call the method that prints the message
            eg.changeEmailTemplate(new Vip());
            eg.sendEmail("VIP VIP VIP!");

            // Assert that the output is what we expect
            assertEquals("Dear VIP!\nVIP VIP VIP!\n",
                    outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }

    }

    @Test
    public void testNewEmailTemplate() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            // Redirect System.out to the output stream
            System.setOut(new PrintStream(outputStream));

            // Call the method that prints the message
            eg.changeEmailTemplate(new New());
            eg.sendEmail("We can't wait to server you!");

            // Assert that the output is what we expect
            assertEquals("Ready to start your journey!\nWe can't wait to server you!\n",
                    outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }

    }

    @Test
    public void testReturningEmailTemplate() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            // Redirect System.out to the output stream
            System.setOut(new PrintStream(outputStream));

            // Call the method that prints the message
            eg.changeEmailTemplate(new Returning());
            eg.sendEmail("Great to have you back!");

            // Assert that the output is what we expect
            assertEquals("Welcome back!\nGreat to have you back!\n",
                    outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }

    }

    @Test
    public void testFrequentEmailTemplate() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            // Redirect System.out to the output stream
            System.setOut(new PrintStream(outputStream));

            // Call the method that prints the message
            eg.changeEmailTemplate(new Frequent());
            eg.sendEmail("How are you doing?");

            // Assert that the output is what we expect
            assertEquals("It's always our pleasure to serve you!\nHow are you doing?\n",
                    outputStream.toString());
        } finally {
            // Restore the original System.out
            System.setOut(originalOut);
        }

    }

}
