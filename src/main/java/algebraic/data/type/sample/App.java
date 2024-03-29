/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package algebraic.data.type.sample;

import algebraic.data.type.sample.enumerate.EnumEvaluatorDemo;
import algebraic.data.type.sample.func.FuncDemo;
import algebraic.data.type.sample.original.OriginalEvaluatorDemo;
import lombok.val;

public class App {

    public static void main(String[] args) {
        val originalDemo = new OriginalEvaluatorDemo();
        originalDemo.show();

        System.out.println();

        val enumDemo = new EnumEvaluatorDemo();
        enumDemo.show();

        System.out.println();

        val funcDemo = new FuncDemo();
        funcDemo.show();
    }
}
