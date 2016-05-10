package task_3;

import java.util.Comparator;

/**
 * Created by Евгений on 31.03.2016.
 */
public class SorterByPrice implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return  -1;
        }
        return 0;
    }
}
