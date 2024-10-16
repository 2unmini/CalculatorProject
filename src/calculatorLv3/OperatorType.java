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
    public static OperatorType mapper(char oper) { //내가 입력 받은 사칙연산 기호가 OperatorType인지 확인 후 리턴
        OperatorType[] operatorTypes = OperatorType.values();
        for (OperatorType operatorType : operatorTypes) {
            if (operatorType.getType() == oper) {
                return operatorType;
            }
        }try {
            throw new NullPointerException();
        }catch (NullPointerException e){
            System.out.println("올바른 연산자(+,-, *, /)만 입력하시오"); // 내가 입력 받은 사칙 연산 기호가 OperatorType아니면 발생하는 예외 처리
        }
        return null;
    }
}

