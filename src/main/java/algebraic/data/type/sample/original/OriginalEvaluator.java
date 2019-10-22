package algebraic.data.type.sample.original;

import algebraic.data.type.sample.Evaluator;

public class OriginalEvaluator<T> implements Evaluator<T> {

    @Override
    public Boolean evaluate(T value) {
        return Boolean.valueOf(value.toString());
    }

    @Override
    public Boolean evaluate(T[] values) {
        throw new IllegalStateException();
    }
}
