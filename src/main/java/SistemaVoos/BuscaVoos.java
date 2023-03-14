package SistemaVoos;

import java.util.List;

public interface BuscaVoos {
    public List<Voo> buscarVoos(String origem, String destino, String Data, List<Voo> listaDeVoos);
}
