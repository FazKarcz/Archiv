package zadanie1;

import java.util.Comparator;

public class LocalDateComparator implements Comparator<Java> {
    @Override
    public int compare(Java o1, Java o2) {
        return -1 * o1.compareTo(o2);
    }
}
