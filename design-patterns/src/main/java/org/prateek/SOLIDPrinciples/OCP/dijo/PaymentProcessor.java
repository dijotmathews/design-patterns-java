package org.prateek.SOLIDPrinciples.OCP.dijo;

public class PaymentProcessor {
    public void processPayment(PaymentMethod pm , int amount) {
        pm.pay(amount);
    }
}
