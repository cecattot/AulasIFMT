package Desconto;

public class Main {
    public static void main(String[] args) {
        double valor = 100;

        CalculadoraDesconto calculadora = new CalculadoraDesconto(new DescontoPadrao());
        double valorComDesconto = calculadora.calcular(valor);
        System.out.println("Valor com desconto padrão: " + valorComDesconto);

        calculadora = new CalculadoraDesconto(new DescontoNatal());
        valorComDesconto = calculadora.calcular(valor);
        System.out.println("Valor com desconto de Natal: " + valorComDesconto);

        calculadora = new CalculadoraDesconto(new DescontoAniversario());
        valorComDesconto = calculadora.calcular(valor);
        System.out.println("Valor com desconto de aniversário: " + valorComDesconto);
    }
}

