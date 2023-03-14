package Desconto;

public class DescontoNatal implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        // Aplica o desconto de Natal de 20%
        return valor * 0.2;
    }
}
