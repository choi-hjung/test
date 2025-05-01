package Lv2.renewal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem("햄버거", 1.0, "설명");

        // List 선언 및 초기화
        List<MenuItem> menuItemList = new ArrayList<>();

        System.out.println("[ SHAKESHACK MENU ]");
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItemList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem 을 하나씩 출력
        menuItem.setMenuItemList(menuItemList);

        int i = 1;
        for (MenuItem menu : menuItemList) {
            System.out.printf("%d. %-14s | w %f | %s \n", i, menu.getName(), menu.getCost(), menu.getInfo());
            i++;
        }

        System.out.print("\n 메뉴 번호 선택해주세요. (1~4) : ");
        // 숫자를 입력 받기
        int num = scanner.nextInt();

        // 입력된 숫자에 따른 처리
        // 선택한 메뉴 : 이름, 가격, 설명
        System.out.printf("%d. %-14s | w %f | %s \n", num, menuItemList.get(num-1).getName(), menuItemList.get(num-1).getCost(), menuItemList.get(num-1).getInfo());

        // 프로그램을 종료
        System.out.println("\n 프로그램을 종료합니다.");
    }
}