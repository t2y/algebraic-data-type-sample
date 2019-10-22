package algebraic.data.type.sample.enumerate;

import algebraic.data.type.sample.Evaluator;

public class EnumEvaluatorDemo {

    public void outputValue(String message, Boolean value) {
        System.out.println(message + ": " + value.toString());
    }

    public void show() {
        System.out.println("# confirm enum evaluator behavior");

        Evaluator<Expr> evaluator = new EnumEvaluator();

        outputValue("true instance", Expr.TRUE.eval(evaluator));
        outputValue("false instance", Expr.FALSE.eval(evaluator));
        outputValue("true and false", Expr.AND.eval(evaluator, Expr.TRUE, Expr.FALSE));
        outputValue("not(true and false)",
                Expr.NOT.eval(evaluator, Expr.AND, Expr.TRUE, Expr.FALSE));
    }
}
