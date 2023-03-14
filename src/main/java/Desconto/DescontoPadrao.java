package Desconto;

public class DescontoPadrao implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        // Aplica o desconto padrão de 10%
        return valor * 0.1;
    }
}