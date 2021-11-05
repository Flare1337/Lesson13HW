package com.company;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Message message = new Message("HELLow");
        Message message2 = new Message("Darova, che po chem?");
        Message message3 = new Message("Are you at home?");
        Message message4 = new Message("I DON'T KNOW WHAT TO SAY");

        CallLog log = new CallLog(Instant.now());
        CallLog log2 = new CallLog(Instant.now());
        CallLog log3 = new CallLog(Instant.now());
        CallLog log4 = new CallLog(Instant.now());

        Contact contact = new Contact(857342344);
        Contact contact2 = new Contact(857342345);
        Contact contact3 = new Contact(857342346);
        Contact contact4 = new Contact(857342347);

        List <Message> messages = new ArrayList<>();
        List <CallLog> logs = new ArrayList<>();
        List <Contact> contacts = new ArrayList<>();

        messages.add(message);
        messages.add(message2);
        messages.add(message3);
        messages.add(message4);

        logs.add(log);
        logs.add(log2);
        logs.add(log3);
        logs.add(log4);

        contacts.add(contact);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);

        long foundNumber = Main.findContact(contacts, 857342345L);
        String foundString = Main.findMessage(messages, "HELLow");
        Instant foundDate = Main.findDate(logs, Instant.now());

        System.out.println("Number: " + foundNumber);
        System.out.println("Found message: " + foundString);
        System.out.println("Time: " + log);
    }

    public static long findContact(Collection<Contact> contactCollection, String number) {
        for (Contact contact1 : contactCollection) {
            if (contact1.getContact()) {
                return contact1.getContact();
            }
        }
        return 0;
    }

    public static String findMessage(Collection<Message> messageCollection, String inputMessage) {
        for (Message message : messageCollection) {
            if (message.getMessage().equals(inputMessage)) {
                return message.getMessage();
            }
        }
        return "There is no message like this";
    }

    public static Collection<CallLog> findDate(Collection<CallLog> dateCollection, String inputDate) {
        Collection<CallLog> callLogs = new ArrayList<>();
        for (CallLog date : dateCollection) {
            if (date.getDate().toString() == inputDate) {

            }
        }
        return callLogs;
    }
}
