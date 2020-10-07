package com.types.dto;

public class Message {
    private String name;
    private String text;
    private String type;

    public Message(String name, String text, String type) {
        this.name = name;
        this.text = text;
        this.type = type;
    }

    public Message() {}

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }
}
