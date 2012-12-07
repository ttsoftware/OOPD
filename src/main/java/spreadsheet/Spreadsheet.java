package spreadsheet;

public class Spreadsheet {

    private final SinglyLinkedListMap map;

    public Spreadsheet() {
        map = new SinglyLinkedListMap();
    }

    public void set(final Position position, final Expression expression) {
        map.insert(position, expression);
    }

    public Expression get(final Position position) {
        return map.lookup(position);
    }
}
