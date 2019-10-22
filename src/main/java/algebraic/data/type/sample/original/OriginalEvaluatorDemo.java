package algebraic.data.type.sample.original;

import algebraic.data.type.sample.Evaluator;
import algebraic.data.type.sample.original.Expr.And;
import algebraic.data.type.sample.original.Expr.False;
import algebraic.data.type.sample.original.Expr.Not;
import algebraic.data.type.sample.original.Expr.True;

public class OriginalEvaluatorDemo {

    public void outputValue(String message, Boolean value) {
        System.out.println(message + ": " + value.toString());
    }

    public void show() {
        System.out.println("# confirm original evaluator behavior");

        Evaluator<Boolean> evaluator = new OriginalEvaluator<>();
        True<Boolean> trueValue = new True<>();
        outputValue("true instance", trueValue.eval(evaluator));

        False<Boolean> falseValue = new False<>();
        outputValue("false instance", falseValue.eval(evaluator));

        And<Boolean> and = new And<>(trueValue, falseValue);
        outputValue("true and false", and.eval(evaluator));

        Not<Boolean> not = new Not<>(and);
        outputValue("not(true and false)", not.eval(evaluator));
    }
}
