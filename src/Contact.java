package com.company.src;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Contact {
    private long phoneNumber;
    private String companyName;

    public Contact(long phoneNumber, String companyName) {
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
    }

    public long getNumber() {
        return phoneNumber;
    }

    public void setNumber(long number) {
        this.phoneNumber = phoneNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return phoneNumber == contact.phoneNumber &&
                companyName.equals(contact.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, phoneNumber);
    }
}
