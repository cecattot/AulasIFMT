package Transporte;

class Aviao implements TransporteStrategy {
    @Override
    public int calcularTempoDeViagem(int distancia) {
        return distancia / 800; // considerando velocidade média de 800 km/h
    }

    @Override
    public double calcularCusto(int distancia) {
        return distancia * 1.5; // considerando R$1,50 por km rodado
    }
}