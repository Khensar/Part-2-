/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Messages {
    ArrayList<String> messageIds = new ArrayList<>();
    ArrayList<String> messageIdsList = new ArrayList<>();
    ArrayList<String> recipientNumber = new ArrayList<>();
    ArrayList<String> messages = new ArrayList<>();
    ArrayList<String> mshHash = new ArrayList<>();
    ArrayList<String> messageStatus = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int numMessageSent = 0;

    public void sendingMessages() {
        System.out.println("How many messages do you want to send ?");
        int numberOfMessaages = input.nextInt();

        input.nextLine();
        for (int i = 1; i <= numberOfMessaages; i++) {
            System.out.println("MESSAGE : " + i);

            String messageID = generateMessageID();

            System.out.println("Enter recipient cell number !!");
            String recipient = input.nextLine();

            String recipientResult = checkRecipientCell(recipient);

            if (!recipientResult.equals("Valid number")) {
                System.out.println(recipientResult);

                i = i - 1;
                continue;
            }

            System.out.println("Enter your message!!");
            String messageText = input.nextLine();

            if (messageText.length() > 250 || messageText.trim().isEmpty()) {
                System.out.println("Your message length should be between 1 to 250");

                i--;
                continue;
            }
        }
    }

    private String generateMessageID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String checkRecipientCell(String recipient) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
