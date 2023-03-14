package Transporte;

class Viagem {
    private TransporteStrategy transporte;

    public void definirMeioDeTransporte(TransporteStrategy transporte) {
        this.transporte = transporte;
    }

    public int calcularTempoDeViagem(int distancia) {
        return transporte.calcularTempoDeViagem(distancia);
    }

    public double calcularCusto(int distancia) {
        return transporte.calcularCusto(distancia);
    }
}