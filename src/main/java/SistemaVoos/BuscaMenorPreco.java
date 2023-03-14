package SistemaVoos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuscaMenorPreco implements BuscaVoos {
    public List<Voo> buscarVoos(String origem, String destino, String data, List<Voo> listaDeVoos) {
        List<Voo> lista = new ArrayList<>();
        // Implementação da busca por menor tempo de voo
        for (Voo voo: listaDeVoos) {
            if(voo.getData().equals(data)&&voo.getDestino().equals(destino)&&voo.getOrigem().equals(origem)){
                lista.add(voo);
            }
        }
        Collections.sort(lista, new PrecoComparator());
        return lista;
    }
}
