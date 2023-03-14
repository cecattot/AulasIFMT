package SistemaVoos;

import java.util.Comparator;

public class PrecoComparator implements Comparator<Voo> {
    @Override
    public int compare(Voo v1, Voo v2) {
        return Double.compare(v1.getPreco(), v2.getPreco());
    }
}