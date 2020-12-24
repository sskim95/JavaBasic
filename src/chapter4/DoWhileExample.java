package chapter4;

public class DoWhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        // 먼저 한 번 수행한 후 while loop으로 이동
        do {
            sum += num;
            num++;
        } while (num <= 10);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
