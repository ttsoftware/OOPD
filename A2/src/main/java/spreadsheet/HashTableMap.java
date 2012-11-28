package spreadsheet;

public class HashTableMap {

    private static int BUCKET_SIZE = 11;

    private Node[] buckets;

    public HashTableMap() {

        buckets = new Node[BUCKET_SIZE];
    }

    public HashTableMap(final int size) {

        BUCKET_SIZE = size;
        buckets = new Node[BUCKET_SIZE];
    }

    public void insert(final Position key, final Expression value) {

        int hash = key.hashCode();
        int index = (hash % BUCKET_SIZE);

        Node entry = buckets[index];
        buckets[index] = new Node(key, value, entry);
    }

    public Expression lookup(final Position key) {

        int hash = key.hashCode();
        int index = (hash % BUCKET_SIZE);

        for (Node entry = buckets[index]; entry != null; entry = entry.getNext()) {
            if ((entry.getHashCode() == hash) && entry.getKey().isEqualTo(key)) {
                return entry.getValue();
            }
        }

        return null;
    }
}
