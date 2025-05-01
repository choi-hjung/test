package Lv2;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    // 속성
    // 햄버거의 이름, 가격, 설명
    private String name;
    private double cost;
    private String info;
    private List<MenuItem> menuItems = new ArrayList<>();

    // 생성자
    public MenuItem(String name, double cost, String info) {
        this.name = name;
        this.cost = cost;
        this.info = info;
    }

    // 기능

}
