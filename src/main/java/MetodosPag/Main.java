package MetodosPag;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Processando pagamento com cartão de crédito
        paymentProcessor.setPaymentMethod(new CreditCardPayment());
        paymentProcessor.processPayment(100.00);

        // Processando pagamento com transferência bancária
        paymentProcessor.setPaymentMethod(new BankTransferPayment());
        paymentProcessor.processPayment(50.00);

        // Processando pagamento com PayPal
        paymentProcessor.setPaymentMethod(new PayPalPayment());
        paymentProcessor.processPayment(75.00);
    }
}
