package org.prateek.SOLIDPrinciples.OCP.dijo;

import org.prateek.SOLIDPrinciples.OCP.dijo.PaymentProcessor;

public class Main {

   public static void main(String[] args){
       CreditCard c = new CreditCard();
       int amount = 100;
       PaymentProcessor p = new PaymentProcessor();
       p.processPayment(c, amount);
       p.processPayment(new DebitCard(), amount);
       p.processPayment(new UPI(), 5);
   }


}
