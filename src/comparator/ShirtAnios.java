package comparator;
import models.Shirt;
import java.util.Comparator;

public class ShirtAnios implements Comparator<Shirt> {
    @Override
    public int compare(Shirt s1, Shirt s2) {
        return s1.getAnios() - s1.getAnios();
    }

}
