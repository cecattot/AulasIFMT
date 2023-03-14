package MetodosPag;

public class BankTransferPayment implements PaymentMethod {
    public void processPayment(double amount) {
        // Lógica de processamento de pagamento com transferência bancária
        System.out.println("Processando pagamento com transferência bancária no valor de R$" + amount);
    }
}

