package org.example;

public class CashPayment implements PayStrategy {
    public void pay() {
        System.out.println("Paiement Cash effectue avec succes");
    }
}
