package com.company;



public class Main {

    public static void main(String[] args) {
	EmailNotification AOLEmail = new EmailNotification("Need Dat Fire", "Sup mayne, drop any fire lately?", "My Boi Kodi", "AWOD");
	TextNotification ColonCloseParenthesis = new TextNotification("Er Mah Gerd", "My Cat is Straight on Fire, Need a bucket of water ASAP", "Clair the Bucket-SalesWoman", "Suncom");

	AOLEmail.transport();
	ColonCloseParenthesis.transport();

	AOLEmail.showStatus();
	ColonCloseParenthesis.showStatus();

	AOLEmail.printText();

        try {
            Object emailNotificationClone = AOLEmail.clone();
            System.out.println(emailNotificationClone.equals(AOLEmail));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



    }
}
