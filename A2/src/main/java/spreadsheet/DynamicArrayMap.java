package spreadsheet;

public class DynamicArrayMap {

    private Node[] list;

    public DynamicArrayMap() {

        list = new Node[0];
    }

    public void insert(final Position key, final Expression value) {

        int length = list.length;

        list = new Node[length + 1];

        list[length] = new Node(key, value);
    }

    public Expression lookup(final Position key) {

        for (Node item : list) {

            if (item.getKey().isEqualTo(key)) {

                return item.getValue();
            }
        }

        return null;
    }
}
