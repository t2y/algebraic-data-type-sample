
package algebraic.data.type.sample.func;

import algebraic.data.type.sample.Evaluator;
import algebraic.data.type.sample.func.Functions.BinaryOpExpr;
import algebraic.data.type.sample.func.Functions.Expr;
import algebraic.data.type.sample.func.Functions.UnaryOpExpr;

public class FuncDemo {

    public void outputValue(String message, Expr<Bool> expr) {
        Evaluator<Expr<Bool>> evaluator = new FuncEvaluator<>();
        Boolean value = evaluator.evaluate(expr);
        System.out.println(message + ": " + value.toString());
    }

    public void show() {
        System.out.println("# confirm functions evaluator behavior");

        // values
        Expr<Bool> trueExpr = () -> Bool.TRUE;
        Expr<Bool> falseExpr = () -> Bool.FALSE;

        // operators
        BinaryOpExpr<Expr<Bool>, Expr<Bool>> and = (x, y) -> {
            return Operator.and(x, y);
        };
        BinaryOpExpr<Expr<Bool>, Expr<Bool>> or = (x, y) -> {
            return Operator.or(x, y);
        };
        UnaryOpExpr<Expr<Bool>, Expr<Bool>> not = x -> Operator.not(x);

        outputValue("true instance", trueExpr);
        outputValue("false instance", falseExpr);
        outputValue("true and false", and.apply(trueExpr, falseExpr));
        outputValue("not(true and false)", not.apply(and.apply(trueExpr, falseExpr)));

        // complex example
        outputValue("(true and false) and (not(false or true))",
                and.apply(
                        and.apply(trueExpr, falseExpr),
                        not.apply(
                                or.apply(falseExpr, trueExpr))));
    }
}
