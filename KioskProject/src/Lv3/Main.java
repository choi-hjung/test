package Lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 객체
        MenuItem menuItem = new MenuItem("햄버거", 1.0, "설명");
        List<MenuItem> menuItemList = new ArrayList<>();
        Kiosk kiosk = new Kiosk(menuItem, menuItemList);

        // 기능 활용
        kiosk.start();
    }
}
