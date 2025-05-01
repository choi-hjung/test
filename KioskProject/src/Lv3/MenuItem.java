package Lv3;

import java.util.List;

public class MenuItem {
    // 속성
    // 햄버거의 이름, 가격, 설명
    private String name;
    private double cost;
    private String info;
    private List<MenuItem> menuItemList;

    // 생성자
    public MenuItem(String name, double cost, String info) {
        this.name = name;
        this.cost = cost;
        this.info = info;
    }

    // 기능


    // 세터
    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    // 게터
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
    public String getInfo() {
        return info;
    }


}
