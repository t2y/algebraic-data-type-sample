package algebraic.data.type.sample.func;

public abstract class Functions {

    @FunctionalInterface
    public interface Expr<R> {
        R eval();
    }

    @FunctionalInterface
    public interface BinaryOpExpr<T, R> {
        R apply(T x, T y);
    }

    @FunctionalInterface
    public interface UnaryOpExpr<T, R> {
        R apply(T value);
    }
}
