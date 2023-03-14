package Desconto;

public class DescontoAniversario implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        // Aplica o desconto de aniversário de 15%
        return valor * 0.15;
    }
}
