package org.prateek.SOLIDPrinciples.DIP.DIP_dijo.BadCode;

import org.prateek.SOLIDPrinciples.DIP.GoodCode.NotificationChannel;

public class NotificationService {
    private NotificationChannel nf;

    NotificationService(NotificationChannel nf) {
        this.nf = nf;
    }

    public void notify(String msg){
        nf.send(msg);
    }
}
