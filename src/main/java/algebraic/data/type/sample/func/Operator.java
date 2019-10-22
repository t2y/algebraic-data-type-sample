package algebraic.data.type.sample.func;

import algebraic.data.type.sample.Evaluator;
import algebraic.data.type.sample.func.Functions.Expr;

public abstract class Operator {

    private static Evaluator<Expr<Bool>> EVALUATOR = new FuncEvaluator<>();

    public static Expr<Bool> and(Expr<Bool> left, Expr<Bool> right) {
        boolean result = EVALUATOR.evaluate(left) && EVALUATOR.evaluate(right);
        return result ? () -> Bool.TRUE : () -> Bool.FALSE;
    }

    public static Expr<Bool> or(Expr<Bool> left, Expr<Bool> right) {
        boolean result = EVALUATOR.evaluate(left) || EVALUATOR.evaluate(right);
        return result ? () -> Bool.TRUE : () -> Bool.FALSE;
    }

    public static Expr<Bool> not(Expr<Bool> expr) {
        boolean result = EVALUATOR.evaluate(expr);
        return result ? () -> Bool.TRUE : () -> Bool.FALSE;
    }
}
