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
            OperatorType type = OperatorType.mapper(oper);

            System.out.println("결과: " + arithmeticCalculator.calculate(num1, num2, type));
            System.out.println("기록: " + arithmeticCalculator.getList());
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력시 삭제)");
            String removeData = sc.next();
            if (removeData.equals("remove")) {
                arithmeticCalculator.removeResult();
            }

            System.out.println("더 계산 하시겠습니까? (exit 입력시 종료)");

            String exit = sc.next();
            if (exit.equals("exit")) {
                return;
            }
            System.out.println("기준 값보다 큰 값을 출력하시겠습니까? (yes 입력시 출력)");
            String max =sc.next();

            if(max.toLowerCase().equals("yes")){
                System.out.println("기준 값을 입력해 주세요");
                double comparisonValue=sc.nextInt();
                ArrayList<Double> list = arithmeticCalculator.getList();
                maxList(comparisonValue,list);
            }
        }
    }

    private static void maxList(double comparisonValue,ArrayList<Double> list) {
        System.out.println("기준값 보다 큰 값은 : " + list.stream().filter(n->comparisonValue<n).collect(Collectors.toList()));

    }


}
