package org.example;

public class PaymentContext {

    PayStrategy strategy;

    public void setStrategy(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public PaymentContext(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment (){
        if (strategy == null){
            System.out.println("Aucun moyen de paiement n'a été selectionne");
            return;
        }
        strategy.pay();
    }



}
