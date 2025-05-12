package org.prateek.SOLIDPrinciples.DIP.DIP_dijo.BadCode;

public class Main {

    public static void main(String[] args) {
        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.notify("Order has been shipped");


        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.notify("OTP is #####");

    }
}
