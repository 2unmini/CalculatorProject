package calculator;

public class Calculator {
    private int result;

    public void calculate(int num1,int num2,char oper){
        switch (oper) {
            case '+':
                result= num1+num2;
                System.out.println("결과: "+result);
                break;
            case '-':
                result= num1-num2;
                System.out.println("결과: "+result);
                break;
            case '*':
                result= num1*num2;
                System.out.println("결과: "+result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }else {
                    result= num1/num2;
                    System.out.println("결과: "+result);
                    break;
                }
        }
    }
}
