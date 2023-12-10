package org.example;

/**
 * Hello world!
 *
 */
public class MainPaymentClass
{
    public static void main( String[] args )
    {
        PaymentContext context = new PaymentContext(new PayPalPayment());
        context.executePayment();

        context.setStrategy(new CashPayment());
        context.executePayment();

        context.setStrategy(null);
        context.executePayment();

    }
}
