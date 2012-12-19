package spreadsheet;

public class Spreadsheet {

    private final SinglyLinkedListMap map;
    private final String name;
    private static int count;

    public Spreadsheet() {
        map = new SinglyLinkedListMap();
        this.name = "Sheet" + count;
        count++;
    }

    public void set(final Position position, final Expression expression) {
        map.insert(position, expression);
    }

    public Expression get(final Position position) {
        return map.lookup(position);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        Spreadsheet spreadsheet = (Spreadsheet) object;
        return spreadsheet.getName().equals(getName());
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(getName());
    }
}
