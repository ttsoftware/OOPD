package spreadsheet;

public class Node {

    private final Position position;
    private final Expression expression;
    private Node next;

    public Node(final Position position, final Expression expression) {
        this.position = position;
        this.expression = expression;
    }

    public Node(final Position position, final Expression expression, Node next) {
        this.position = position;
        this.expression = expression;
        this.next = next;
    }

    public Position getKey() {
        return position;
    }

    public Expression getValue() {
        return expression;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public boolean isEqualTo(final Node other) {
        return !(position != other.getKey() || expression != other.getValue());
    }
}
