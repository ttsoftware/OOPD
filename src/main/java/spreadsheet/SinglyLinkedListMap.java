package spreadsheet;

public class SinglyLinkedListMap {

    private Node head;

    public SinglyLinkedListMap() {
        head = null;
    }

    public void insert(final Position key, final Expression value) {
        Node node = new Node(key, value);
        node.setNext(head);
        head = node;
    }

    public Expression lookup(final Position key) {
        Node node = head;
        while (node != null) {
            if (node.getKey().isEqualTo(key))
                return node.getValue();
            node = node.getNext();
        }
        return null;
    }
}