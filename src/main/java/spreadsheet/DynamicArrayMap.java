package spreadsheet;

public class DynamicArrayMap {

    private Node[] nodes;

    public DynamicArrayMap() {
        nodes = new Node[0];
    }

    public void insert(final Position key, final Expression value) {
        int length = nodes.length;
        Node[] newList = new Node[length + 1];
        System.arraycopy(nodes, 0, newList, 0, nodes.length);
        newList[length] = new Node(key, value);
        this.nodes = newList;
    }

    public Expression lookup(final Position key) {
        for (Node node : nodes)
            if (node.getKey().isEqualTo(key))
                return node.getValue();
        return null;
    }
}
