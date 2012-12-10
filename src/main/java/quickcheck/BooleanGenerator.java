package quickcheck;

public class BooleanGenerator extends Generator<Boolean> {

    @Override
    public Boolean next() {
        return this.getRandom().nextBoolean();
    }
}
