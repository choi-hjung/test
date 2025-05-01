package Lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // List 선언 및 초기화
        ArrayList<String> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        menuItems.add("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        menuItems.add("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        menuItems.add("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);
        System.out.println("메뉴 번호를 입력해주세요. (1~4입력, 0을 입력하면 종료)");
        System.out.println("[ SHAKESHACK MENU ]");

        // 반복문을 활용해 List 안에 있는 MenuItem 을 하나씩 출력

        for (int i = 1; i <= 4; i++) {
            // 숫자를 입력 받기
            int num = scanner.nextInt();
            if (num == 0) {
                break; // 프로그램을 종료
            } // 입력된 숫자에 따른 처리
            System.out.println(menuItems.get(num-1));
        } // 선택한 메뉴 : 이름, 가격, 설명

    }
}
