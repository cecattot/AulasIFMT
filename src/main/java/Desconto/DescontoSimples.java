package Desconto;

public class DescontoSimples {
    public double calcular(double valor, String tipo) {
        double descontoCalculado = 0;
        if (tipo.equals("padrao")) {
            descontoCalculado = valor * 0.1;
        } else if (tipo.equals("natal")) {
            descontoCalculado = valor * 0.2;
        } else if (tipo.equals("aniversario")) {
            descontoCalculado = valor * 0.15;
        }
        return valor - descontoCalculado;
    }
}

