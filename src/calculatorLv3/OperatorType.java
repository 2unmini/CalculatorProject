package calculatorLv3;

public enum OperatorType {
    PLUS('+'),MINUS('-'),MULTIPLY('*'),DIVIDE('/');
    private char type;
    OperatorType(char type) {
        this.type=type;
    }

    public char getType() {
        return type;
    }
}

