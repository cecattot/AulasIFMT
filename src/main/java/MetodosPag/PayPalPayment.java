package MetodosPag;

public class PayPalPayment implements PaymentMethod {
    public void processPayment(double amount) {
        // Lógica de processamento de pagamento com PayPal
        System.out.println("Processando pagamento com PayPal no valor de R$" + amount);
    }
}
