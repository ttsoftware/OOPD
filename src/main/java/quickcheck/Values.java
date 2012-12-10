package quickcheck;

import java.util.ArrayList;
import java.util.Iterator;

public class Values<T> implements Iterable<T> {

    private final ArrayList<T> list = new ArrayList<T>(10);

    public Values(Generator<T> generator) {
        for (int i = 0; i < 10; i++) {
            list.add(generator.next());
        }
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
