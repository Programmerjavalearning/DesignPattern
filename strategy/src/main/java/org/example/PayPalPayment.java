package org.example;

public class PayPalPayment implements PayStrategy {
    public void pay() {
        System.out.println("Paiement PayPal effectue avec succes");
    }
}
