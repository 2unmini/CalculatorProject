package calculatorLv2;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> resultList = new ArrayList<>();// 결과를 담을 리스트 생성
    public ArrayList<Integer> getList() {//결과가 담긴 리스트를 직접가져오지 않고 getter를 이용
        return resultList;
    }

    public void setList(ArrayList<Integer> list) {
        this.resultList = list;
    }

    private int result;
    Operation operation=new Operation();



    public int calculate(int num1, int num2, char oper){
        switch (oper) {
            case '+'://+를 입력 받으면
                result= operation.add(num1,num2); // +기능을 하는 메소드 호출
                break;
            case '-'://-를 입력 받으면
                result= operation.subtract(num1,num2);// -기능을 하는 메소드 호출
                break;
            case '*'://*를 입력 받으면
                result= operation.multiply(num1,num2);// *기능을 하는 메소드 호출
                break;
            case '/':// /를 입력 받으면
                if (num2 == 0) { //분모가 0이 될 경우는 연산이 안됨
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }else {
                    result= operation.divide(num1,num2); // 분모가 0이 아니면 /기능을 하는 메소드 호출
                    break;
                }
            default: // 올바른 연산자가 아닐 경우 올바른 연산자를 입력하라는 예외를 던짐
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("올바른 연산자(+,-, *, /)만 입력하시오");;
                }
        }
        resultList.add(result); // 수행한 결과를 결과리스트에 저장
        return result;
    }

    public void removeResult(){ // 저장된 결과 리스트에 가장 최근 값을 삭제하는 메소드
        int remove =resultList.get(0);
        resultList.remove(resultList.get(0));
        System.out.println(remove+" 가 제거 되었습니다.");
        System.out.println("현재 기록: " + resultList.toString());
    }
}
