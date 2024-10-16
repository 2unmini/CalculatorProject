package calculatorLv3;

import java.util.ArrayList;

public class ArithmeticCalculator {
    private ArrayList<Double> resultList = new ArrayList<>();// 결과를 담을 리스트 생성

    public ArrayList<Double> getResultList() {
        return resultList;
    }//결과가 담긴 리스트를 직접가져오지 않고 getter를 이용

    public void setResultList(ArrayList<Double> resultList) {
        this.resultList = resultList;
    }

    Operation<Integer> operation = new Operation();
    double result = 0;


    public double calculate(int num1, int num2, OperatorType type) {
        switch (type) { //각각 맞는 OperatorType에 따라 메소드 호출
            case PLUS:
                result = operation.add(num1, num2); //+기능을 하는 메소드 호출
                break;
            case MINUS:
                result = operation.subtract(num1, num2); // -기능을 하는 메소드 호출
                break;
            case MULTIPLY:
                result = operation.multiply(num1, num2); // *기능을 하는 메소드 호출
                break;
            case DIVIDE: // /를 입력 받으면
                if (num2 == 0) { //분모가 0이 될 경우는 연산이 안됨
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                } else {
                    result = operation.divide(num1, num2); // 분모가 0이 아니면 /기능을 하는 메소드 호출
                    break;
                }
        }
        resultList.add(result); // 수행한 결과를 결과리스트에 저장
        return result;
    }

    public void removeResult() { // 저장된 결과 리스트에 가장 최근 값을 삭제하는 메소드
        Double remove = resultList.get(0);
        resultList.remove(resultList.get(0));
        System.out.println(remove + " 가 제거 되었습니다.");
        System.out.println("현재 기록: " + resultList.toString());
    }


}
