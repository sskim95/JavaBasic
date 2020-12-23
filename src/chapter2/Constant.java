package chapter2;

public class Constant {
    public static void main(String[] args) {
        // 상수는 변하지 않는 값 대문자 사용
        final int MAX_NUM = 100;
        final int MIN_NUM;

        MIN_NUM = 0;

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        // MAX_NUM = 1000;
        // 상수는 값을 변경할 수 없음
    }
}
