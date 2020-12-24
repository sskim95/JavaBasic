package chapter4;

public class NestedLoop {
    public static void main(String[] args) {
        int dan;
        int times;
        // Nested For Loop (For loop 2번 사용)
        for (dan = 2; dan <= 9; dan++) {
            for (times = 1; times <= 9; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
        }
    }
}
