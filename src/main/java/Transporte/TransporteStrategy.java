package Transporte;

interface TransporteStrategy {
    int calcularTempoDeViagem(int distancia);
    double calcularCusto(int distancia);
}
