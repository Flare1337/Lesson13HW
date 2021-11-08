package com.company.src;


import java.util.ArrayList;
import java.util.Collection;

public class Contact {
    private long number;
    private String companyName;

    public Contact(long number, String companyName) {
        this.number = number;
        this.companyName = companyName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public static Collection<Contact> findContact(Collection<Contact> contactCollection, String number) {
        Collection<Contact> contacts = new ArrayList<>();
        for (Contact contact : contactCollection) {
            if (String.valueOf(contact.getNumber()).equals(number)) {
                contacts.add(contact);
            }
        }
        return contactCollection;
    }
}
