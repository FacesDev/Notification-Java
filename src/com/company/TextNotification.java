package com.company;

/**
 * Created by solderedmachd on 7/19/17.
 */
public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        super.printText();
    }

    @Override
    public void transport() {
        System.out.println("Recipient value: " + recipient);
        System.out.println("smsProvider value: " + smsProvider);
        System.out.println("Created At value: " + getCreatedAt());
        System.out.println("Subject value: " + getSubject());
        System.out.println("Body value: " + getBody());
        System.out.println("Status value: " + showStatus());

    }




}
