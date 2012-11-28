import spreadsheet.Expression;
import spreadsheet.HashTableMap;
import spreadsheet.Position;
import spreadsheet.SinglyLinkedListMap;

import static org.junit.Assert.assertTrue;

public class Test {

    @org.junit.Test
    public void testLinkedList() {

        Position p = new Position(1, 0);
        Expression e = new Expression("test");

        SinglyLinkedListMap map = new SinglyLinkedListMap();

        map.insert(p, e);

        Expression result = map.lookup(p);

        assertTrue(result.getValue().equals("test"));
    }

    @org.junit.Test
    public void testArrayMap() {


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
        map.insert(new Position(1, 1), e1);
        map.insert(new Position(2, 1), e1);
        map.insert(new Position(3, 1), e1);
        map.insert(new Position(4, 1), e1);
        map.insert(new Position(5, 1), e1);
        map.insert(new Position(6, 1), e1);
        map.insert(new Position(7, 1), e1);
        map.insert(new Position(8, 1), e1);
        map.insert(new Position(9, 1), e1);
        map.insert(new Position(10, 1), e1);
        map.insert(new Position(11, 1), e1);
        map.insert(new Position(12, 1), e1);
        map.insert(new Position(13, 1), e1);
        map.insert(new Position(14, 1), e1);
        map.insert(new Position(15, 1), e1);
        map.insert(new Position(16, 1), e1);
        map.insert(new Position(17, 1), e1);
        map.insert(new Position(18, 1), e1);
        map.insert(new Position(19, 1), e1);

        Expression result0 = map.lookup(p0);
        Expression result1 = map.lookup(p1);
        Expression result2 = map.lookup(new Position(19, 1));

        assertTrue(result0.getValue().equals("test"));
        assertTrue(result1.getValue().equals("tset"));

        assert(result2 == null);
    }
}
