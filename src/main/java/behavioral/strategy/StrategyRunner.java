package behavioral.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        Strategy[] algorithms = {new FOO(), new BAR()};
        for (Strategy algorithm : algorithms) {
            execute(algorithm);
        }
    }

    private static void execute(Strategy strategy) {
        strategy.solve();
    }
}
