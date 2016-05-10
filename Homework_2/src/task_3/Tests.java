package task_3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Евгений on 29.03.2016.
 */
public class Tests {
    @Test
    public void testBeginnerSet() {
        Stationery[] set = {new Pen(5), new Pencil(2.5)};
        BeginnerSet.addToSet(set);
        BeginnerSet.addToSet(new NoteBook(7));
        assertTrue(BeginnerSet.getBeginnerSet().size() == 3);
    }
    @Test
    public  void testName() {
        Pen pen = new Pen(2);
        System.out.println(pen.getClass());
        assertTrue(pen.getName().equals("pen"));
    }
    @Test
    public void testCollection() {
        BeginnerSet.getBeginnerSet().forEach(System.out::println);
    }
//    @Test
//    public void TestSortingOrder() {
//        BeginnerSet.setSortingOrder(new SorterByName());
//        BeginnerSet.getBeginnerSet().forEach(System.out::println);
//    }
}
