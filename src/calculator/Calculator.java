package calculator;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    private int result;



    public int calculate(int num1, int num2, char oper){
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
        int remove =list.get(0);
        list.remove(list.get(0));
        System.out.println(remove+" 가 제거 되었습니다.");
        System.out.println("현재 기록: " + list.toString());
    }
}
