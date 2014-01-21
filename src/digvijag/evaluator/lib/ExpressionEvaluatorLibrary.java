package digvijag.evaluator.lib;

public class ExpressionEvaluatorLibrary {
    int numberOne, numberTwo, result;

    public int evaluate(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            if ('+' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = numberOne + numberTwo;
            }
            if ('-' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = numberOne - numberTwo;
            }
            if ('*' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = numberOne * numberTwo;
            }
            if ('/' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = numberOne / numberTwo;
            }
            if ('^' == expression.charAt(i)) {
                result = 1;
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                for (int j = 0; j < numberTwo; j++) {
                    result *= numberOne;
                }
            }
        }
        return result;
    }
}