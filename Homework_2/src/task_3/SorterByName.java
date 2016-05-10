package task_3;

import java.util.Comparator;

/**
 * Created by Евгений on 31.03.2016.
 */
public class SorterByName implements Comparator<Stationery> {
    @Override
    public int compare(Stationery o1, Stationery o2) {

        String str1 = o1.getName();
        String str2 = o2.getName();

        return str1.compareTo(str2);
    }
}
