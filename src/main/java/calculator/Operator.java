package calculator;

import java.util.Arrays;

public enum Operator {
    PLUS("+") {
        @Override
        int calculate(int firstOperand, int secondOperand) {
            return firstOperand + secondOperand;
        }
    },
    MINUS("-") {
        @Override
        int calculate(int firstOperand, int secondOperand) {
            return firstOperand - secondOperand;
        }
    },
    TIMES("*") {
        @Override
        int calculate(int firstOperand, int secondOperand) {
            return firstOperand * secondOperand;
        }
    },
    DIVISION("/") {
        @Override
        int calculate(int firstOperand, int secondOperand) {
            return firstOperand / secondOperand;
        }
    };

    private String symbol;

    abstract int calculate(int firstOperand, int secondOperand);

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public static Operator findSymbol(String operator) {
        return Arrays.stream(Operator.values())
                .filter(symbol -> symbol.symbol.equals(operator))
                .findAny()
                .orElse(null);
    }
}
