package calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true){
            System.out.println("첫 번째 정수 입력 : ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 정수 입력 : ");
            int num2 =sc.nextInt();
            System.out.println("사칙 연산 기호를 입력 : ");
            char oper=sc.next().charAt(0);
            calculator.calculate(num1,num2,oper);
            System.out.println("더 계산 하시겠습니까? (exit 입력시 종료)");
            String exit =sc.next();
            if(exit.equals("exit")){
                return;
            }
        }

    }
}
