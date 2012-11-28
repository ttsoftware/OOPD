package spreadsheet;

public class SinglyLinkedListMap {

    private Node root;
    private Node current = null;

    public SinglyLinkedListMap() {
    }

    public void insert(final Position key, final Expression value) {

        if (current == null) {

            root = new Node(key, value);
            current = root;
        }
        else {
            current.setNext(new Node(key, value));
        }
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
