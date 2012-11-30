package spreadsheet;

public class Spreadsheet {

    private HashTableMap map;

    public Spreadsheet() {
        map = new HashTableMap();
    }

    public void set(final Position position, final Expression expression) {

        map.insert(position, expression);
    }

    public Expression get(final Position position) {

        return map.lookup(position);
    }
}
