package SistemaVoos;

import java.util.Comparator;

public class TempoComparator implements Comparator<Voo> {
    @Override
    public int compare(Voo v1, Voo v2) {
        return Double.compare(v1.getTempoDeVoo(), v2.getTempoDeVoo());
    }
}