package org.prateek.SOLIDPrinciples.OCP.dijo;

public class CreditCard implements PaymentMethod {
    public void pay(int amount) {
        System.out.println("Making payment through credit card :"+ amount);
    }
}
