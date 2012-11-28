package spreadsheet;

public class Node {

    private final Position key;
    private final Expression value;
    private Node next = null;

    public Node(final Position key, final Expression value) {

        this.key = key;
        this.value = value;
    }

    public Node(final Position key, final Expression value, Node next) {
        this.next = next;
        this.key = key;
        this.value = value;
    }

    public int getHashCode() {

        return key.hashCode();
    }

    public boolean isEqualTo(final Node other) {

        return (other.getKey().isEqualTo(this.getKey()) && other.getValue() == this.getValue());
    }

    public Position getKey() {
        return key;
    }

    public Expression getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
