package comparator;
import models.Shirt;
import java.util.Comparator;

public class ShirtComparator implements Comparator<Shirt> {

    @Override
    public int compare(Shirt s1, Shirt s2) {
        return s1.getTalla() - s2.getTalla();
    }
}
