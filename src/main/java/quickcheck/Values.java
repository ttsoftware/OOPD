package quickcheck;

import java.util.ArrayList;
import java.util.Iterator;

public class Values<T> implements Iterable<T> {

    private ArrayList<T> list = new ArrayList<T>(1);

    public Values(Generator<T> generator) {
        list.add(generator.next());
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }


}
