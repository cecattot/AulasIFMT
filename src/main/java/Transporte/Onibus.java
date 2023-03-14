package Transporte;

class Onibus implements TransporteStrategy {
    @Override
    public int calcularTempoDeViagem(int distancia) {
        return distancia / 60; // considerando velocidade média de 60 km/h
    }

    @Override
    public double calcularCusto(int distancia) {
        return distancia * 0.2; // considerando R$0,20 por km rodado
    }
}