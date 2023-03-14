package Transporte;

public class Main {
    public static void main(String[] args) {
        Viagem viagem = new Viagem();
        TransporteStrategy transporte;

        // definindo carro como meio de transporte
        transporte = new Carro();
        viagem.definirMeioDeTransporte(transporte);
        int tempoDeViagem = viagem.calcularTempoDeViagem(1500);
        double custo = viagem.calcularCusto(500);
        System.out.println("De carro: " + tempoDeViagem + " horas, R$" + custo);

        // definindo ônibus como meio de transporte
        transporte = new Onibus();
        viagem.definirMeioDeTransporte(transporte);
        tempoDeViagem = viagem.calcularTempoDeViagem(1500);
        custo = viagem.calcularCusto(500);
        System.out.println("De ônibus: " + tempoDeViagem + " horas, R$" + custo);

        // definindo avião como meio de transporte
        transporte = new Aviao();
        viagem.definirMeioDeTransporte(transporte);
        tempoDeViagem = viagem.calcularTempoDeViagem(1500);
        custo = viagem.calcularCusto(500);
        System.out.println("De avião: " + tempoDeViagem + " horas, R$" + custo);
    }
}

