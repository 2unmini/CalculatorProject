package calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=0;

        while (true){
            System.out.println("첫 번째 정수 입력 : ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 정수 입력 : ");
            int num2 =sc.nextInt();
            System.out.println("사칙 연산 기호를 입력 : ");
            char oper=sc.next().charAt(0);
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
            System.out.println("더 계산 하시겠습니까? (exit 입력시 종료)");
            String exit =sc.next();
            if(exit.equals("exit")){
                return;
            }
        }
    }
}
