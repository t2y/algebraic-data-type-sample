package algebraic.data.type.sample.enumerate;

import java.util.Arrays;

import algebraic.data.type.sample.Evaluator;

public class EnumEvaluator implements Evaluator<Expr> {

    @Override
    public Boolean evaluate(Expr value) {
        return Boolean.valueOf(value.toString());
    }

    @Override
    public Boolean evaluate(Expr[] values) {
        Expr expr = values[0];
        if (values.length == 2) {
            return expr.eval(this, values[1]);
        } else {
            return expr.eval(this, Arrays.copyOfRange(values, 1, values.length));
        }
    }
}
