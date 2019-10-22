package algebraic.data.type.sample;

public interface Evaluator<T> {

    Boolean evaluate(T value);

    Boolean evaluate(T[] values);
}