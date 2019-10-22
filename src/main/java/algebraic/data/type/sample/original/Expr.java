package algebraic.data.type.sample.original;

import algebraic.data.type.sample.Evaluator;

public abstract class Expr<T> {

    public abstract boolean eval(Evaluator<T> evaluator);

    public static class True<T> extends Expr<T> {
        public boolean eval(Evaluator<T> evaluator) {
            return true;
        }
    }

    public static class False<T> extends Expr<T> {
        public boolean eval(Evaluator<T> evaluator) {
            return false;
        }
    }

    public static class Base<T> extends Expr<T> {
        public final T value;

        public Base(T value) {
            this.value = value;
        }

        public boolean eval(Evaluator<T> evaluator) {
            return evaluator.evaluate(value);
        }
    }

    public static class And<T> extends Expr<T> {
        public final Expr<T> left;
        public final Expr<T> right;

        public And(Expr<T> left, Expr<T> right) {
            this.left = left;
            this.right = right;
        }

        public boolean eval(Evaluator<T> evaluator) {
            return left.eval(evaluator) && right.eval(evaluator);
        }
    }

    public static class Or<T> extends Expr<T> {
        public final Expr<T> left;
        public final Expr<T> right;

        public Or(Expr<T> left, Expr<T> right) {
            this.left = left;
            this.right = right;
        }

        public boolean eval(Evaluator<T> evaluator) {
            return left.eval(evaluator) || right.eval(evaluator);
        }
    }

    public static class Not<T> extends Expr<T> {
        public final Expr<T> expr;

        public Not(Expr<T> expr) {
            this.expr = expr;
        }

        public boolean eval(Evaluator<T> evaluator) {
            return !expr.eval(evaluator);
        }
    }
}
