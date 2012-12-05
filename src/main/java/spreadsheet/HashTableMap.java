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
        int index = (hash & 0x7FFFFFFF) % BUCKET_SIZE;

        System.out.println("Insert index: " + index);

        if (index >= BUCKET_SIZE) {
            // we somehow need to resize the map
            BUCKET_SIZE += (BUCKET_SIZE * 1.75);

            System.out.println("\nNew bucket size: " + BUCKET_SIZE + "\n");

            Node[] newBuckets = new Node[BUCKET_SIZE];
            System.arraycopy(buckets, 0, newBuckets, 0, buckets.length);
            buckets = newBuckets;
        }

        Node entry = buckets[index];
        buckets[index] = new Node(key, value, entry);
    }

    public Expression lookup(final Position key) {

        int hash = key.hashCode();
        int index = (hash & 0x7FFFFFFF) % BUCKET_SIZE;

        System.out.println(index);
        System.out.println(hash);
        System.out.println("START\n");

        for (Node entry : buckets) {

            System.out.println(entry.getValue().getValue());
            System.out.println("---");
        }

        for (Node entry = buckets[index]; entry != null; entry = entry.getNext()) {

            if ((entry.getHashCode() == hash) && entry.getKey().isEqualTo(key)) {
                return entry.getValue();
            }
        }

        return null;
    }
}
