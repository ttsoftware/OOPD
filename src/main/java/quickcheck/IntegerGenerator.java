package quickcheck;

public class IntegerGenerator extends Generator<Integer> {

    @Override
    public Integer next() {
        return getRandom().nextInt();
    }
}
