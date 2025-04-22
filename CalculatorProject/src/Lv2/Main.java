package Lv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = scanner.nextInt();
            System.out.print("사칙연산 기호(+, -, *, /)를 입력하세요 : ");
            String op = scanner.next();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = scanner.nextInt();

            if (op.equals("+")) {
                int result = num1 + num2;
                System.out.println("결과 : " + result);
            } else if (op.equals("-")) {
                int result = num1 - num2;
                System.out.println("결과 : " + result);
            } else if (op.equals("*")) {
                int result = num1 * num2;
                System.out.println("결과 : " + result);
            } else if (op.equals("/")) {
                int result = num1 / num2;
                System.out.println("결과 : " + result);
            } else {
                System.out.println("잘못된 입력입니다.");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (scanner.next().equals("exit")) {
                break;
            }
        }




    }
}
