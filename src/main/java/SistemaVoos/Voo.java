package SistemaVoos;

public class Voo {
    private String origem;
    private String destino;
    private String data;
    private Double tempoDeVoo;
    private double preco;

    public Voo(String origem, String destino, String data, Double tempoDeVoo, double preco) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.tempoDeVoo = tempoDeVoo;
        this.preco = preco;
    }

    // Getters e setters dos atributos
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Double getTempoDeVoo() {
        return tempoDeVoo;
    }

    public void setTempoDeVoo(Double tempoDeVoo) {
        this.tempoDeVoo = tempoDeVoo;
    }

    @Override
    public String toString() {
        return "SistemaVoos.Voo{" +
                "origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data='" + data + '\'' +
                ", tempoDeVoo=" + tempoDeVoo +
                ", preco=" + preco +
                '}';
    }
}
