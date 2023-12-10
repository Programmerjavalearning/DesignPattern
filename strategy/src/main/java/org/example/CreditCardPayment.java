package org.example;

public class CreditCardPayment implements PayStrategy {
    public void pay() {
        System.out.println("Paiement Credit-Card effectue avec succes");
    }
}
