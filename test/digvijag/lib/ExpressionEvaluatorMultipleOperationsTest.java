package digvijag.lib;

import digvijag.evaluator.lib.ExpressionEvaluatorLibrary;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionEvaluatorMultipleOperationsTest {
    @Test
    public void test_add_three_integers() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 7;
        int actual = evaluator.evaluate("2+3+2");
        assertEquals(expected, actual);
    }

    @Test
    public void test_add_four_integers() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 9;
        int actual = evaluator.evaluate("2+3+2+2");
        assertEquals(expected, actual);
    }

    @Test
     public void test_add_multiple_integers() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 10;
        int actual = evaluator.evaluate("2+3+2+2+1");
        assertEquals(expected, actual);
    }

    @Test
    public void test_subtraction_of_multiple_integers() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 2;
        int actual = evaluator.evaluate("4-1-1");
        assertEquals(expected, actual);
    }
}