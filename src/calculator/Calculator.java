package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> list = new ArrayList<>();
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int calculate(int num1, int num2, char oper){
        Calculator calculator = new Calculator();
        switch (oper) {
            case '+':
                result= num1+num2;
                break;
            case '-':
                result= num1-num2;
                break;
            case '*':
                result= num1*num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }else {
                    result= num1/num2;
                    break;
                }
        }
        list.add(result);
        return result;
    }

    public void removeResult(){
        Calculator calculator = new Calculator();
        System.out.println(list.remove(calculator.getResult())+" 가 제거 되었습니다.");
        System.out.println("현재 기록: " + list.toString());
    }
}
