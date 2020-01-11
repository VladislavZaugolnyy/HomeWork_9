package behavioral.interpreter;

public class Number implements Expression {

    private final int n;

    public Number(int n) {
        this.n = n;
    }

    public int interpret() {
        return n;
    }
}
