package task_3;

import java.util.*;

/**
 * Created by Евгений on 29.03.2016.
 */
public class BeginnerSet {
    private static Set<Stationery> beginnerSet = new TreeSet<>(new SorterByPrice());

    public static void addToSet(Stationery[] items) {
        for (Stationery item : items) {
            beginnerSet.add(item);
        }
    }

    public static void addToSet(Stationery item) {
        beginnerSet.add(item);
    }

    public static Set<Stationery> getBeginnerSet() {
        return beginnerSet;
    }

    public static void setSortingOrder(Comparator comparator) {
        beginnerSet = new TreeSet<>(comparator);
    }
}