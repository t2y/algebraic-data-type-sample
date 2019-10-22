package algebraic.data.type.sample.func;

import algebraic.data.type.sample.Evaluator;
import algebraic.data.type.sample.func.Functions.Expr;

public class FuncEvaluator<T> implements Evaluator<Expr<T>> {

    @Override
    public Boolean evaluate(Expr<T> expr) {
        T value = expr.eval();
        return Boolean.valueOf(value.toString());
    }

    @Override
    public Boolean evaluate(Expr<T>[] values) {
        throw new IllegalStateException();
    }
}
