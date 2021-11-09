package com.company.src;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Message message = new Message("HELLow", "Dave", 857342346);
        Message message2 = new Message("Darova, che po chem?", "Danya", 857342344);
        Message message3 = new Message("Hey, what's up?", "Mike", 857342344);
        Message message4 = new Message("Are you at home?", "Jake", 857342347);
        Message message5 = new Message("I DON'T KNOW WHAT TO SAY", "Unknown", 857342345);
        Message message6 = new Message("Huh, bye...", "John", 857342345);
        Message message7 = new Message("Huh, bye...", "John", 857342345);
        Message message8 = new Message("Huh, bye...", "John", 857342345);

        CallLog log = new CallLog(Instant.now(),857342345, true);
        CallLog log2 = new CallLog(Instant.now(), 857342346, true);
        CallLog log3 = new CallLog(Instant.now(),857342344, false);
        CallLog log4 = new CallLog(Instant.now(), 857342346, false);
        CallLog log5 = new CallLog(Instant.now(), 857342345, true);
        CallLog log6 = new CallLog(Instant.now(), 857342346, false);
        CallLog log7 = new CallLog(Instant.now(), 857342346, false);
        CallLog log8 = new CallLog(Instant.now(), 857342346, false);


        Contact contact = new Contact(857342344, "Coursera");
        Contact contact2 = new Contact(857342345, "Google");
        Contact contact3 = new Contact(857342346, "Yandex");
        Contact contact4 = new Contact(857342347, "ZeroGravity");
        Contact contact5 = new Contact(857342346, "Disney");
        Contact contact6 = new Contact(857342347, "Roshen");
        Contact contact7 = new Contact(857342347, "Roshen");
        Contact contact8 = new Contact(857342347, "Roshen");


        List<Message> messages = new ArrayList<>();
        List<CallLog> logs = new ArrayList<>();
        List<Contact> contacts = new ArrayList<>();

        messages.add(message);
        messages.add(message2);
        messages.add(message3);
        messages.add(message4);
        messages.add(message5);
        messages.add(message6);
        messages.add(message7);
        messages.add(message8);

        logs.add(log);
        logs.add(log2);
        logs.add(log3);
        logs.add(log4);
        logs.add(log5);
        logs.add(log6);
        logs.add(log7);
        logs.add(log8);

        contacts.add(contact);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        contacts.add(contact6);
        contacts.add(contact7);
        contacts.add(contact8);

        Collection<Contact> foundNumbers = Contact.findContact(contacts, String.valueOf(857342345L));
        Collection<Message> foundStrings = Message.findMessage(messages, "HELLow");
        Collection<CallLog> foundDates = CallLog.findDate(logs, Instant.now().toString());

        Main.iterativeCollectionFinder(foundNumbers, foundStrings, foundDates);

        System.out.println("\n Следующее, 4 задание");
        HashSet<Message> uniqueMessages = new HashSet<>(messages);
        HashSet<CallLog> uniqueСallogs = new HashSet<>(logs);
        HashSet<Contact> uniqueContacts = new HashSet<>(contacts);

        System.out.println("Просто вывод всех объектов");
        Main.iterativeCollectionFinder(contacts, messages, uniqueСallogs);
        System.out.println("\n Уникальные объекты \n");
        Main.iterativeCollectionFinder(uniqueContacts, uniqueMessages , uniqueСallogs);
        // Или проверить есть ли в методе дубликаты с помощью метода который написал в аудитории, пример
        // А может и к лучшему что не пришлось так решать
        // System.out.println("Имеет дубликаты? " + Main.isCallLogCollectionHasDuplicates(logs));
        // System.out.println("Имеет дубликаты? x2 " + Main.isCallLogCollectionHasDuplicates(uniqueСallogs));
    }
    public static void iterativeCollectionFinder(Collection<Contact> contactCollection,
                                                 Collection<Message> messageCollection,
                                                 Collection<CallLog> callLogCollection) {
        callLogCollection.forEach(callLog -> System.out.println("callLog = " + callLog.getDate().toString()));
        contactCollection.forEach(contact -> System.out.println("contact = " + contact.getNumber()));
        messageCollection.forEach(message -> System.out.println("message = " + message.getMessage()));
    }

    public static boolean isCallLogCollectionHasDuplicates(Collection<CallLog> collection) {
        HashSet<CallLog> collection2 = new HashSet<>(collection);
        var counter = 0;
        for (CallLog callLog : collection) {
            for (CallLog callLog2 : collection2) {
                if (callLog.equals(callLog2)) {
                    ++counter;
                    if (counter > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
