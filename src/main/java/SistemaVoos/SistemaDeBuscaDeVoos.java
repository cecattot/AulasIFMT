package SistemaVoos;

import java.util.List;

public class SistemaDeBuscaDeVoos {
    private BuscaVoos buscaVoos;

    public void definirCriterioDeBusca(BuscaVoos buscaVoos) {
        this.buscaVoos = buscaVoos;
    }

    public List<Voo> buscarVoos(String origem, String destino, String data, List<Voo> voos) {
        return buscaVoos.buscarVoos(origem, destino, data, voos);
    }
}
