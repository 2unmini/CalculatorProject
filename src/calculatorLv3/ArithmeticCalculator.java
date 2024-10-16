package calculatorLv3;

import java.util.ArrayList;

public class ArithmeticCalculator {
    private ArrayList<Double> list = new ArrayList<>();

    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> list) {
        this.list = list;
    }

    Operation<Integer> operation = new Operation();
    double result = 0;


    public double calculate(int num1, int num2, OperatorType type) {
        switch (type) {
            case PLUS:
                result = operation.add(num1, num2);
                break;
            case MINUS:
                result = operation.subtract(num1, num2);
                break;
            case MULTIPLY:
                result = operation.multiply(num1, num2);
                break;
            case DIVIDE:
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                } else {
                    result = operation.divide(num1, num2);
                    break;
                }
        }
        list.add(result);
        return result;
    }

    public void removeResult() {
        Double remove = list.get(0);
        list.remove(list.get(0));
        System.out.println(remove + " 가 제거 되었습니다.");
        System.out.println("현재 기록: " + list.toString());
    }


}
