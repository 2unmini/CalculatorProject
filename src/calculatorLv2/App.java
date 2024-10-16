package calculatorLv2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("첫 번째 정수 입력 : ");
            int num1 = 0;
            int num2 = 0;
            char oper= '0';
            try {
                num1 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력하시오.");
                return;
            }

            System.out.println("두 번째 정수 입력 : ");
            try {
                num2 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력하시오.");
                return;
            }
            System.out.println("사칙 연산 기호를 입력 : ");
            oper = sc.next().charAt(0);

            System.out.println("결과: " + calculator.calculate(num1, num2, oper));
            System.out.println("기록: " + calculator.getList());
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력시 삭제)");
            String removeData = sc.next();
            if (removeData.equals("remove")) {
                calculator.removeResult();
            }

            System.out.println("더 계산 하시겠습니까? (exit 입력시 종료)");

            String exit = sc.next();
            if (exit.equals("exit")) {
                return;
            }
        }
    }


}
