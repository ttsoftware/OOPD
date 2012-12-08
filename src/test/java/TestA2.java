import org.junit.Test;
import spreadsheet.*;
import spreadsheet.textual.TConst;

import static org.junit.Assert.assertTrue;

public class TestA2 {

    @Test
    public void testSpreadsheet() {

        long start = System.currentTimeMillis();

        Spreadsheet map = new Spreadsheet();

        map.set(new Position(2, 1), new TConst("test1"));
        map.set(new Position(3, 1), new TConst("test2"));
        map.set(new Position(4, 1), new TConst("test3"));
        map.set(new Position(5, 1), new TConst("test4"));
        map.set(new Position(6, 1), new TConst("test5"));
        map.set(new Position(7, 1), new TConst("test6"));

        map.set(new Position(1, 1), new TConst("penis"));

        map.set(new Position(8, 1), new TConst("test7"));
        map.set(new Position(9, 1), new TConst("test8"));
        map.set(new Position(10, 1), new TConst("test9"));
        map.set(new Position(11, 1), new TConst("test10"));
        map.set(new Position(12, 1), new TConst("test11"));
        map.set(new Position(13, 1), new TConst("test12"));
        map.set(new Position(14, 1), new TConst("test13"));
        map.set(new Position(15, 1), new TConst("test14"));
        map.set(new Position(16, 1), new TConst("test15"));
        map.set(new Position(17, 1), new TConst("test16"));
        map.set(new Position(18, 1), new TConst("test17"));
        map.set(new Position(19, 1), new TConst("test18"));

        Expression result2 = map.get(new Position(1, 1));

        Expression result3 = map.get(new Position(2, 1));
        Expression result4 = map.get(new Position(3, 1));
        Expression result5 = map.get(new Position(4, 1));
        Expression result6 = map.get(new Position(5, 1));
        Expression result7 = map.get(new Position(6, 1));
        Expression result8 = map.get(new Position(7, 1));
        Expression result9 = map.get(new Position(8, 1));
        Expression result10 = map.get(new Position(9, 1));
        Expression result11 = map.get(new Position(10, 1));
        Expression result12 = map.get(new Position(11, 1));
        Expression result13 = map.get(new Position(12, 1));
        Expression result14 = map.get(new Position(13, 1));
        Expression result15 = map.get(new Position(14, 1));

        assertTrue(result2.toString().equals("penis"));

        assertTrue(result3.toString().equals("test1"));
        assertTrue(result4.toString().equals("test2"));
        assertTrue(result5.toString().equals("test3"));
        assertTrue(result6.toString().equals("test4"));
        assertTrue(result7.toString().equals("test5"));
        assertTrue(result8.toString().equals("test6"));
        assertTrue(result9.toString().equals("test7"));
        assertTrue(result10.toString().equals("test8"));
        assertTrue(result11.toString().equals("test9"));
        assertTrue(result12.toString().equals("test10"));
        assertTrue(result13.toString().equals("test11"));
        assertTrue(result14.toString().equals("test12"));
        assertTrue(result15.toString().equals("test13"));

        long end = System.currentTimeMillis();
        System.out.println("Execution time was " + (end - start) + " ms.");
    }

    @Test
    public void testLinkedList() {

        Position p = new Position(1, 0);
        Expression e = new TConst("test");

        SinglyLinkedListMap map = new SinglyLinkedListMap();

        map.insert(p, e);
        map.insert(new Position(1, 1), new TConst("penis"));

        Expression result1 = map.lookup(p);
        Expression result2 = map.lookup(new Position(1, 1));

        assertTrue(result1.toString().equals("test"));
        assertTrue(result2.toString().equals("penis"));
    }

    @Test
    public void testArrayMap() {

        Position p = new Position(1, 0);
        Expression e = new TConst("test");

        DynamicArrayMap map = new DynamicArrayMap();

        map.insert(p, e);

        Expression result = map.lookup(p);

        assertTrue(result.toString().equals("test"));
    }

    @Test
    public void testHashTableMap() {

        Position p0 = new Position(1, 0);
        Position p1 = new Position(3, 2);
        Expression e0 = new TConst("test");
        Expression e1 = new TConst("tset");

        HashTableMap map = new HashTableMap();

        map.insert(p0, e0);
        map.insert(p1, e1);
        map.insert(new Position(1, 1), new TConst("test"));
        map.insert(new Position(2, 1), new TConst("test"));
        map.insert(new Position(3, 1), new TConst("test"));
        map.insert(new Position(4, 1), new TConst("test"));
        map.insert(new Position(5, 1), new TConst("test"));
        map.insert(new Position(6, 1), new TConst("test"));
        map.insert(new Position(7, 1), new TConst("test"));
        map.insert(new Position(8, 1), new TConst("test"));
        map.insert(new Position(9, 1), new TConst("test"));
        map.insert(new Position(10, 1), new TConst("test"));
        map.insert(new Position(11, 1), new TConst("test"));
        map.insert(new Position(12, 1), new TConst("test"));
        map.insert(new Position(13, 1), new TConst("test"));
        map.insert(new Position(14, 1), new TConst("test"));
        map.insert(new Position(15, 1), new TConst("test"));
        map.insert(new Position(16, 1), new TConst("test"));
        map.insert(new Position(17, 1), new TConst("test"));
        map.insert(new Position(18, 1), new TConst("test"));
        map.insert(new Position(19, 1), new TConst("test"));

        Expression result0 = map.lookup(p0);
        Expression result1 = map.lookup(p1);
        Expression result2 = map.lookup(new Position(19, 1));

        assertTrue(result0.toString().equals("test"));
        assertTrue(result1.toString().equals("tset"));
        assertTrue(result2.toString().equals("test"));
    }
}