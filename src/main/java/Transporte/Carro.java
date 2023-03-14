package Transporte;

class Carro implements TransporteStrategy {
    @Override
    public int calcularTempoDeViagem(int distancia) {
        return distancia / 80; // considerando velocidade média de 80 km/h
    }

    @Override
    public double calcularCusto(int distancia) {
        return distancia * 0.5; // considerando R$0,50 por km rodado
    }
}