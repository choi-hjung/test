package Lv2;

public class Calculator {
    // 1. 속성
    private int num1;
    private int num2;
    private String op;


    // 2. 생성자
    public String Calculate(int num1, int num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        return op;
    }

    // 3. 기능
//    public void sum() {
//        int result = num1 + num2;
//    }
}
