package Desconto;

public class CalculadoraDesconto {
    private Desconto desconto;

    public CalculadoraDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcular(double valor) {
        // Aplica a estratégia selecionada
        double descontoCalculado = desconto.calcularDesconto(valor);
        return valor - descontoCalculado;
    }
}

