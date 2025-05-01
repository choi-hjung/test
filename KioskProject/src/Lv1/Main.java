package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("메뉴 번호를 입력해주세요. (1~4입력, 0을 입력하면 종료)");
        System.out.println("[ SHAKESHACK MENU ]");

        while (true) {
            int num = scanner.nextInt();

            if (0 < num || num < 5) {
                if (num == 1) {
                    System.out.println(num + ". ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                } else if (num == 2) {
                    System.out.println(num + ". SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                } else if (num == 3) {
                    System.out.println(num + ". Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                } else if (num == 4) {
                    System.out.println(num + ". Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                } else if (num == 0) {
                    System.out.println("종료");
                    break;
                } else {
                    System.out.println("숫자 1~4 중에서 입력해주세요.");
                }
            }
        }

    }
}

