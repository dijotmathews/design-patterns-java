package org.prateek.SOLIDPrinciples.OCP.dijo;

public class UPI implements PaymentMethod{
    public void pay(int amount) {
        System.out.println("Making payment through UPI :" + amount);
    }
}
