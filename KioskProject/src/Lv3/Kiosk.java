package Lv3;

import java.util.List;
import java.util.Scanner;

// 전체 순서 제어
// 메뉴 관리 | 사용자 입력 처리
public class Kiosk {
    // 속성
    private MenuItem menuItem;
    private List<MenuItem> menuItemList;

    // 생성자
    public Kiosk(MenuItem menuItem, List<MenuItem> menuItemList) {
        this.menuItem = menuItem;
        this.menuItemList = menuItemList;
    }

    // 기능
    public void start() {
        System.out.println("[ SHAKESHACK MENU ]");
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItemList.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItemList.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner scanner = new Scanner(System.in);

        // 콘솔에 햄버거 메뉴를 출력합니다.
        menuItem.setMenuItemList(menuItemList);

        int i = 1;
        for (MenuItem menu : menuItemList) {
            System.out.printf("%d. %-14s | w %f | %s \n", i, menu.getName(), menu.getCost(), menu.getInfo());
            i++;
        }

        System.out.print("\n 메뉴 번호 선택해주세요. (1~4) : ");
        while (true) {
            // 숫자를 입력 받기
            int num = scanner.nextInt();
            // 입력된 숫자에 따른 처리
            if (num == 0) {
                // 프로그램을 종료
                System.out.println("\n 프로그램을 종료합니다.");
                break;
            } else if (num < 5) {
                // 선택한 메뉴 : 이름, 가격, 설명
                System.out.printf("%d. %-14s | w %f | %s \n", num, menuItemList.get(num-1).getName(), menuItemList.get(num-1).getCost(), menuItemList.get(num-1).getInfo());
                break;
            }
            System.out.println("유효하지 않은 입력입니다. 다른 메뉴를 선택하시거나 0번을 눌러 프로그램을 종료해주세요.");
            System.out.print("\n 메뉴 번호 선택해주세요. (1~4) : ");
        }
    }
}
