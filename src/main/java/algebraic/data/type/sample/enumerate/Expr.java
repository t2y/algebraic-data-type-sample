package algebraic.data.type.sample.enumerate;

import algebraic.data.type.sample.Evaluator;

public enum Expr {

    TRUE {
        @Override
        public boolean eval(Evaluator<Expr> evaluator, Expr... args) {
            return true;
        }
    },

    FALSE {
        @Override
        public boolean eval(Evaluator<Expr> evaluator, Expr... args) {
            return false;
        }
    },

    BASE {
        @Override
        public boolean eval(Evaluator<Expr> evaluator, Expr... args) {
            return evaluator.evaluate(args[0]);
        }
    },

    AND {
        @Override
        public boolean eval(Evaluator<Expr> evaluator, Expr... args) {
            return evaluator.evaluate(args[0]) && evaluator.evaluate(args[1]);
        }
    },

    OR {
        @Override
        public boolean eval(Evaluator<Expr> evaluator, Expr... args) {
            return evaluator.evaluate(args[0]) || evaluator.evaluate(args[1]);
        }
    },

    NOT {
        @Override
        public boolean eval(Evaluator<Expr> evaluator, Expr... args) {
            return !evaluator.evaluate(args);
        }
    };

    // 但し、定数によって引数の数を固定にすることはできない
    public abstract boolean eval(Evaluator<Expr> evaluator, Expr... args);
}
