package quickcheck;

import java.util.ArrayList;
import java.util.Iterator;

public class Values<T> implements Iterable<T> {

    private final ArrayList<T> list = new ArrayList<T>(10);

    public Values(Generator<T> generator, Integer count) {
        for (int i = 0; i < count; i++) {
            list.add(generator.next());
        }
    }

    public Values(Generator<T> generator) {
        this(generator, 10);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
