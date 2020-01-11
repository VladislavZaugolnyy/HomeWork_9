package behavioral.interpreter;

public class ExpressionUtils {
    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*"))
            return true;
        else
            return false;
    }

    public static Expression getOperator(String string, Expression left, Expression right) {
        if ("+".equals(string)) {
            return new Add(left, right);
        } else if ("-".equals(string)) {
            return new Subtract(left, right);
        } else if ("*".equals(string)) {
            return new Product(left, right);
        }
        return null;
    }
}
