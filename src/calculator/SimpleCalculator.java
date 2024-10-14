package calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수 입력 : ");
        int num2 =sc.nextInt();
        System.out.println("사칙 연산 기호를 입력 : ");
        char oper=sc.next().charAt(0);
        switch (oper){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                if(num2==0){
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }else {
                    System.out.println(num1/num2);
                    break;
                }

        }


    }
}
