package org.prateek.SOLIDPrinciples.DIP.DIP_dijo.BadCode;

import org.prateek.SOLIDPrinciples.DIP.GoodCode.NotificationChannel;

class SMSService implements NotificationChannel {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}