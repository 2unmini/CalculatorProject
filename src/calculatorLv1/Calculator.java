package calculatorLv1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0; // 결과를 저장할 변수 초기화
        while (true) {
            System.out.println("첫 번째 정수 입력 : ");
            int num1 = sc.nextInt(); //첫번째 정수 입력
            System.out.println("두 번째 정수 입력 : ");
            int num2 = sc.nextInt(); //두번째 정수 입력
            System.out.println("사칙 연산 기호를 입력 : ");
            char oper = sc.next().charAt(0); //사칙 연산 기호(+,-.*,/)를 입력
            switch (oper) {
                case '+': //+를 입력 받으면
                    result = num1 + num2; // 두수를 덧셈해 result 변수에 저장
                    break;
                case '-'://-를 입력 받으면
                    result = num1 - num2; // 두수를 뺄셈해 result 변수에 저장
                    break;
                case '*'://*를 입력 받으면
                    result = num1 * num2; // 두수를 곱셈해 result 변수에 저장
                    break;
                case '/': // /를 입력 받으면
                    if (num2 == 0) {//분모가 0이 될 경우는 연산이 안됨
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    } else {
                        result = num1 / num2; // 분모가 0이 아니면 두수를 나눗셈해 result 변수에 저장
                        break;
                    }
            }
            System.out.println("결과: " + result); // 연산을 수행해 저장된 결과를 출력
            System.out.println("더 계산 하시겠습니까? (exit 입력시 종료)"); // exit 입력 시 종료

            String exit = sc.next();
            if (exit.equals("exit")) {
                return;
            }

        }
    }

}
