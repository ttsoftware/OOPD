import spreadsheet.*;

import static org.junit.Assert.assertTrue;

public class Test {

    @org.junit.Test
    public void testSpreadsheet() {

        long start = System.currentTimeMillis();

        Spreadsheet map = new Spreadsheet();

        map.set(new Position(2, 1), new Expression("test1"));
        map.set(new Position(3, 1), new Expression("test2"));
        map.set(new Position(4, 1), new Expression("test3"));
        map.set(new Position(5, 1), new Expression("test4"));
        map.set(new Position(6, 1), new Expression("test5"));
        map.set(new Position(7, 1), new Expression("test6"));

        map.set(new Position(1, 1), new Expression("penis"));

        map.set(new Position(8, 1), new Expression("test7"));
        map.set(new Position(9, 1), new Expression("test8"));
        map.set(new Position(10, 1), new Expression("test9"));
        map.set(new Position(11, 1), new Expression("test10"));
        map.set(new Position(12, 1), new Expression("test11"));
        map.set(new Position(13, 1), new Expression("test12"));
        map.set(new Position(14, 1), new Expression("test13"));
        map.set(new Position(15, 1), new Expression("test14"));
        map.set(new Position(16, 1), new Expression("test15"));
        map.set(new Position(17, 1), new Expression("test16"));
        map.set(new Position(18, 1), new Expression("test17"));
        map.set(new Position(19, 1), new Expression("test18"));

        Expression result2 = map.get(new Position(1, 1));

        /*
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
        */

        assertTrue(result2.getValue().equals("penis"));

        /*
        assertTrue(result3.getValue().equals("test1"));
        assertTrue(result4.getValue().equals("test2"));
        assertTrue(result5.getValue().equals("test3"));
        assertTrue(result6.getValue().equals("test4"));
        assertTrue(result7.getValue().equals("test5"));
        assertTrue(result8.getValue().equals("test6"));
        assertTrue(result9.getValue().equals("test7"));
        assertTrue(result10.getValue().equals("test8"));
        assertTrue(result11.getValue().equals("test9"));
        assertTrue(result12.getValue().equals("test10"));
        assertTrue(result13.getValue().equals("test11"));
        assertTrue(result14.getValue().equals("test12"));
        assertTrue(result15.getValue().equals("test13"));
        */

        long end = System.currentTimeMillis();
        System.out.println("Execution time was " + (end - start) + " ms.");
    }

    @org.junit.Test
    public void testLinkedList() {

        Position p = new Position(1, 0);
        Expression e = new Expression("test");

        SinglyLinkedListMap map = new SinglyLinkedListMap();

        map.insert(p, e);
        map.insert(new Position(1, 1), new Expression("penis"));

        Expression result1 = map.lookup(p);
        Expression result2 = map.lookup(new Position(1, 1));

        assertTrue(result1.getValue().equals("test"));
        assertTrue(result2.getValue().equals("penis"));
    }

    @org.junit.Test
    public void testArrayMap() {

        Position p = new Position(1, 0);
        Expression e = new Expression("test");

        DynamicArrayMap map = new DynamicArrayMap();

        map.insert(p, e);

        Expression result = map.lookup(p);

        assertTrue(result.getValue().equals("test"));
    }

    @org.junit.Test
    public void testHashTableMap() {

        Position p0 = new Position(1, 0);
        Position p1 = new Position(3, 2);
        Expression e0 = new Expression("test");
        Expression e1 = new Expression("tset");

        HashTableMap map = new HashTableMap();

        map.insert(p0, e0);
        map.insert(p1, e1);
        map.insert(new Position(1, 1), new Expression("test"));
        map.insert(new Position(2, 1), new Expression("test"));
        map.insert(new Position(3, 1), new Expression("test"));
        map.insert(new Position(4, 1), new Expression("test"));
        map.insert(new Position(5, 1), new Expression("test"));
        map.insert(new Position(6, 1), new Expression("test"));
        map.insert(new Position(7, 1), new Expression("test"));
        map.insert(new Position(8, 1), new Expression("test"));
        map.insert(new Position(9, 1), new Expression("test"));
        map.insert(new Position(10, 1), new Expression("test"));
        map.insert(new Position(11, 1), new Expression("test"));
        map.insert(new Position(12, 1), new Expression("test"));
        map.insert(new Position(13, 1), new Expression("test"));
        map.insert(new Position(14, 1), new Expression("test"));
        map.insert(new Position(15, 1), new Expression("test"));
        map.insert(new Position(16, 1), new Expression("test"));
        map.insert(new Position(17, 1), new Expression("test"));
        map.insert(new Position(18, 1), new Expression("test"));
        map.insert(new Position(19, 1), new Expression("test"));

        Expression result0 = map.lookup(p0);
        Expression result1 = map.lookup(p1);
        Expression result2 = map.lookup(new Position(19, 1));

        assertTrue(result0.getValue().equals("test"));
        assertTrue(result1.getValue().equals("tset"));
        assertTrue(result2.getValue().equals("test"));
    }
}
