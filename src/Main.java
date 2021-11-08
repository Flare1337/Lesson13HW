package com.company.src;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Message message = new Message("HELLow", "Dave");
        Message message2 = new Message("Darova, che po chem?", "Danya");
        Message message3 = new Message("Are you at home?", "Jake");
        Message message4 = new Message("I DON'T KNOW WHAT TO SAY", "Unknown");

        CallLog log = new CallLog(Instant.now(), new ArrayIndexOutOfBoundsException());
        CallLog log2 = new CallLog(Instant.now(), new IllegalAccessException());
        CallLog log3 = new CallLog(Instant.now(), new NullPointerException());
        CallLog log4 = new CallLog(Instant.now(), new FunnyException("Woohooo!"));

        Contact contact = new Contact(857342344, "Coursera");
        Contact contact2 = new Contact(857342345, "Google");
        Contact contact3 = new Contact(857342346,"Yandex");
        Contact contact4 = new Contact(857342347, "ZeroGravity");

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

        Collection <Contact> foundNumbers = Contact.findContact(contacts, String.valueOf(857342345L));
        Collection <Message> foundStrings = Message.findMessage(messages, "HELLow");
        Collection <CallLog> foundDates = CallLog.findDate(logs, Instant.now().toString());

        Main.iterativeCollectionFinder(foundNumbers, foundStrings, foundDates);
    }
    public static void iterativeCollectionFinder(Collection<Contact> contactCollection,
                                                 Collection<Message> messageCollection,
                                                 Collection<CallLog> callLogCollection) {
        callLogCollection.forEach(callLog -> System.out.println("callLog = " + callLog.getDate().toString()));
        contactCollection.forEach(contact -> System.out.println("contact = " + contact.getNumber()));
        messageCollection.forEach(message -> System.out.println("message = " + message.getMessage()));
    }
}
