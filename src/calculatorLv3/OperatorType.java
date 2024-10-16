package calculatorLv3;

public enum OperatorType {
    PLUS('+'),MINUS('-'),MULTIPLY('*'),DIVIDE('/');
    private final char type;
    OperatorType(char type) {
        this.type=type;
    }

    public char getType() {
        return type;
    }
    public static OperatorType mapper(char oper) {
        OperatorType[] operatorTypes = OperatorType.values();
        for (OperatorType operatorType : operatorTypes) {
            if (operatorType.getType() == oper) {
                return operatorType;
            }
        }try {
            throw new NullPointerException();
        }catch (NullPointerException e){
            System.out.println("올바른 연산자(+,-, *, /)만 입력하시오");
        }
        return null;
    }
}

