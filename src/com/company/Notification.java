package com.company;
import java.time.LocalDateTime;

/**
 * Created by solderedmachd on 7/19/17.
 */
public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;



    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void transport(){
        throw new NoTransportException();
    }

    public String showStatus(){
        System.out.println(status);
        return status;
    }

    protected void printText(){
        System.out.println("This Is Text");
    }
}
