package calculatorLv3;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        while (true) {
            System.out.println("첫 번째 정수 입력 : ");
            int num1 = 0; //첫번째 입력 받을 정수값 초기화
            int num2 = 0; // 두번째 입력 받을 정수값 초기화
            char oper= '0'; // 사칙 연산 기호를 입력받을 문자값 초기화
            try {
                num1 = sc.nextInt(); //첫번째 정수 입력
            } catch (InputMismatchException e) { // 정수가 아닐때 발생하는 예외(InputMismatchException)를 처리
                System.out.println("정수만 입력하시오.");
                return;
            }

            System.out.println("두 번째 정수 입력 : "); //두번째 정수 입력
            try {
                num2 = sc.nextInt();
            } catch (InputMismatchException e) { // 정수가 아닐때 발생하는 예외(InputMismatchException)를 처리
                System.out.println("정수만 입력하시오.");
                return;
            }
            System.out.println("사칙 연산 기호를 입력 : ");
            oper = sc.next().charAt(0); //사칙 연산 기호(+,-.*,/)를 입력
            OperatorType type = OperatorType.mapper(oper); //OperatorType으로 변환

            System.out.println("결과: " + arithmeticCalculator.calculate(num1, num2, type)); // Calculator클래스에 있는 계산 메소드로 호출하여 반환된 결과 값을 출력
            System.out.println("기록: " + arithmeticCalculator.getResultList()); // 저장된 결과 리스트를 getter로 가져와 출력
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력시 삭제)"); // remove 입력 시 removeResult메소드 호출
            String removeData = sc.next();
            if (removeData.equals("remove")) {
                arithmeticCalculator.removeResult();
            }

            System.out.println("더 계산 하시겠습니까? (exit 입력시 종료)"); // exit 입력 시 종료

            String exit = sc.next();
            if (exit.equals("exit")) {
                return;
            }
            System.out.println("기준 값보다 큰 값을 출력하시겠습니까? (yes 입력시 출력)");
            String max =sc.next();

            if(max.toLowerCase().equals("yes")){
                System.out.println("기준 값을 입력해 주세요");
                double comparisonValue=sc.nextInt();
                ArrayList<Double> list = arithmeticCalculator.getResultList();
                maxList(comparisonValue,list);
            }
        }
    }

    private static void maxList(double comparisonValue,ArrayList<Double> list) {
        System.out.println("기준값 보다 큰 값은 : " + list.stream().filter(n->comparisonValue<n).collect(Collectors.toList()));

    }


}
