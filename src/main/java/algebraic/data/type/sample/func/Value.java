package algebraic.data.type.sample.func;

public abstract class Value<T> {

    public static class Base<T> extends Value<T> {
        public final T value;

        public Base(T value) {
            this.value = value;
        }
    }
}
