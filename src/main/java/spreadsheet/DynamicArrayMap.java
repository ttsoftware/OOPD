package spreadsheet;

public class DynamicArrayMap {

    private Node[] list;

    public DynamicArrayMap() {

        list = new Node[0];
    }

    public void insert(final Position key, final Expression value) {

        int length = list.length;
        Node[] newList = new Node[length + 1];

        System.arraycopy(list, 0, newList, 0, list.length);

        newList[length] = new Node(key, value);
        this.list = newList;
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
