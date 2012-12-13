package quickcheck;

import java.util.ArrayList;
import java.util.Iterator;

public class Values<T> implements Iterable<T> {

    private final ArrayList<T> list;

    public Values(Generator<T> generator) {
        this(generator, 10);
    }

    public Values(Generator<T> generator, int count) {
        list = new ArrayList<T>(count);
        for (int i = 0; i < count; i++) {
            list.add(generator.next());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
