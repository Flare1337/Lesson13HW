package com.company.src;

import java.util.ArrayList;
import java.util.Collection;

public class Message {
    private String message;
    private String name;

    public Message(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Collection <Message> findMessage(Collection<Message> messageCollection, String inputMessage) {
        Collection<Message> messages = new ArrayList<>();
        for (Message message : messageCollection) {
            if (message.getMessage().equals(inputMessage)) {
                messages.add(message);
            }
        }
        return messages;
    }
}
