package spreadsheet;

public class SinglyLinkedListMap {

    private Node root;

    public SinglyLinkedListMap() {
    }

    public void insert(final Position key, final Expression value) {

        Node current = new Node(key, value);
        current.setNext(root);
        root = current;
    }

    public Expression lookup(final Position key) {

        Node iterator = root;

        while (iterator != null) {

            if (iterator.getKey().isEqualTo(key)) {
                return iterator.getValue();
            }
            else {
                iterator = iterator.getNext();
            }
        }

        return null;
    }
}
