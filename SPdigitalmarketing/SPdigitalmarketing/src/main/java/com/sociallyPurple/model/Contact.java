package com.sociallyPurple.model;

public class Contact {
    private String name;
    private String email;
    private String subject;
    private String message;

    // ✅ Required: no-args constructor
    public Contact() {}

    // ✅ Required: getters & setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
