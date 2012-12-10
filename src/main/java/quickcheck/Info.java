package quickcheck;

public abstract class Info<T> {

    private final T value;

    protected Info(final T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public abstract String toString();
}
