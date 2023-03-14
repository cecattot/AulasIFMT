package MetodosPag;

public class CreditCardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        // Lógica de processamento de pagamento com cartão de crédito
        System.out.println("Processando pagamento com cartão de crédito no valor de R$" + amount);
    }
}
