
import java.util.Comparator;

public class Comparador implements Comparator<Estudante> {

    public int compare(Estudante x, Estudante y) {

        if(x.getNota() < y.getNota()) return 1;
        if(x.getNota() > y.getNota()) return -1;
        return 0;

    }

}